package com.chat;

import com.chat.ChatParser.MentionContext;

public class ChatHtmlListener extends ChatBaseListener{

	StringBuilder html = new StringBuilder();
	
	public String getHtml() {
		return html.toString();
	}
	
	@Override
	public void enterName( ChatParser.NameContext ctx) {
		html.append("<strong>");
		// TODO Auto-generated method stub
	}
	
	@Override
	public void exitName( ChatParser.NameContext ctx ) {
		html.append(ctx.WORD().getText());
		html.append("</strong> ");
	}
	
	@Override
	public void enterCommand(ChatParser.CommandContext ctx) {
		if( ctx.SAYS() != null ) {
			html.append("SAYS: <p>");
		} else {
			html.append("SHOUTS: <p style='text-transform:uppercase'>");
		}
	}
	
	@Override
	public void exitLine(ChatParser.LineContext ctx) {
		html.append("</p>");
	}
	
	@Override
	public void exitEmoticon(ChatParser.EmoticonContext ctx) {
		String emo = ctx.getText();
		
		if( emo.equals(":-)") || emo.equals(":)")) {
			html.append("😊");
		} else if (emo.equals(":-(") || emo.equals(":(")) {
			html.append("😢");
		}
	}
	
	@Override
	public void enterColor(ChatParser.ColorContext ctx) {
		String color = ctx.WORD().getText();
		html.append("<span style='color:" + color + "'>");
	}
	
	@Override
	public void exitColor(ChatParser.ColorContext ctx) {
		// Remove this line - you already opened the span in enterColor
	    // html.append("<span style='color:" + color + "'>");
	    
	    // Just close the span
	    html.append("</span>");

	}
	
	@Override
	public void exitMessage(ChatParser.MessageContext ctx) {

		for (int i = 0; i < ctx.getChildCount(); i++) {
	        var child = ctx.getChild(i);
	        
	        // Skip color open tag - already handled by enterColor
	        if (child instanceof ChatParser.ColorContext) {
	            // Color content is handled by its children
	            continue;
	        }
	        
	        // Skip emoticon - already handled
	        if (child instanceof ChatParser.EmoticonContext) {
	            continue;
	        }
	        
	        html.append(child.getText());
	    }
	}
	
	@Override
	public void exitMention(MentionContext ctx) {
		// TODO Auto-generated method stub
		html.append(ctx.getText());  
	}
	
}
