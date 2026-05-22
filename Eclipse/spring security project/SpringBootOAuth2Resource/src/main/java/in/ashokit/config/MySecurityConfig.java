package in.ashokit.config;

import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeHttpRequests(
				authorize ->
					authorize.requestMatchers("/**").authenticated()
				)
			.oauth2ResourceServer(spec -> spec.jwt(Customizer.withDefaults())); // give login page for /employees, jwt 
		
		httpSecurity.sessionManagement(SessionManagementConfigurer::disable);	
		httpSecurity.csrf( csrf -> csrf.disable());
		return httpSecurity.build();
		
	}
	
	@Bean
	public JwtDecoder jwtDecoder(OAuth2ResourceServerProperties properties) {
		return JwtDecoders.fromIssuerLocation(properties.getJwt().getIssuerUri());
	}
	
}
