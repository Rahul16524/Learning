package in.ashokit.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import in.ashokit.exception.TokenExpiredException;
import in.ashokit.util.JwtUtil;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtFilter extends OncePerRequestFilter {
    
    @Autowired
    private JwtUtil jwtUtil;
    
    @Autowired
    private UserDetailsService userDetailsService;
    
    @Override
    protected void doFilterInternal(HttpServletRequest request, 
                                   HttpServletResponse response, 
                                   FilterChain chain)
            throws ServletException, IOException {
        
        try {
            String authorizationHeader = request.getHeader("Authorization");
            String username = null;
            String jwt = null;
            
            // Extract JWT token from Authorization header
            if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
                jwt = authorizationHeader.substring(7);
                
                // Validate token first before extracting username
                if (jwtUtil.validateToken(jwt)) {
                    username = jwtUtil.extractUsername(jwt);
                }
            }
            
            // If we have a username and no authentication in context yet
            if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                
                UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
                
                // Create authentication token
                UsernamePasswordAuthenticationToken authToken = 
                    new UsernamePasswordAuthenticationToken(
                        userDetails, 
                        null, 
                        userDetails.getAuthorities()
                    );
                
                // Set authentication in SecurityContext
                SecurityContextHolder.getContext().setAuthentication(authToken);
            }
            
            // Continue the filter chain
            chain.doFilter(request, response);
            
        } catch (TokenExpiredException ex) {
            // Handle token expiration
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setContentType("application/json");
            response.getWriter().write("{\"error\": \"JWT Token expired or invalid\"}");
            response.getWriter().flush();
            return; // Important: stop further processing
        } catch (Exception ex) {
            // Handle any other exceptions
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.setContentType("application/json");
            response.getWriter().write("{\"error\": \"Authentication failed: " + ex.getMessage() + "\"}");
            response.getWriter().flush();
            return;
        }
    }
    
    // Optional: Skip JWT filter for login endpoint to avoid unnecessary processing
    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {
        String path = request.getRequestURI();
        return path.equals("/api/login");
    }
}