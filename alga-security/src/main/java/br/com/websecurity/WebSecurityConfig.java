package br.com.websecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/projetos").hasAnyRole("PG_PROJETOS")
			.antMatchers("/relatorio-equipe").hasAnyRole("PG_REL_EQUIPE")
			.antMatchers("/relatorio-custos").hasAnyRole("PG_REL_PROJETOS")
			//qual url o user precisa estar autenticado
			.anyRequest()
			.authenticated()
			.and().formLogin().loginPage("/entrar").permitAll();
	}
}
