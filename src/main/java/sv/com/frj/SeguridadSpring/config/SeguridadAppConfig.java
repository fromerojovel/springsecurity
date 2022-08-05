package sv.com.frj.SeguridadSpring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SeguridadAppConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	UserBuilder usuarios=User.withDefaultPasswordEncoder();
	
	auth.inMemoryAuthentication().withUser(usuarios.username("fran").password("fran").roles("admin"));
	auth.inMemoryAuthentication().withUser(usuarios.username("juan").password("juan").roles("usuario"));
	auth.inMemoryAuthentication().withUser(usuarios.username("norma").password("norma").roles("admin"));
	auth.inMemoryAuthentication().withUser(usuarios.username("samuel").password("samuel").roles("cajero"));
	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	
//	http.autorizeRequests().anyRequest().authenticated().and().formLogin()		
		http.authorizeRequests()
		.antMatchers("/").hasRole("usuario")
		.antMatchers("/administradores/**").hasRole("admin")
		.and().formLogin()
		.loginPage("/miFormularioLogin")
		.loginProcessingUrl("/autenticacionUsuario")
		.permitAll()
		.and().logout().permitAll();
		
		
		
	}
	
	
}