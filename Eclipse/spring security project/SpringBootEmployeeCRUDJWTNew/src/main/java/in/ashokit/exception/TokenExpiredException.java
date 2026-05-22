package in.ashokit.exception;

public class TokenExpiredException extends RuntimeException{
	
	public TokenExpiredException(String message) {
		super(message);
	}
}
