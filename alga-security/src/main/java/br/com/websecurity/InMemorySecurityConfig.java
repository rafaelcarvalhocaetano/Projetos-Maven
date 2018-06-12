package br.com.websecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
public class InMemorySecurityConfig {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder build) throws Exception {
		build
			.inMemoryAuthentication()
			.passwordEncoder(NoOpPasswordEncoder.getInstance())
			.withUser("rose").password("123").roles("PG_PROJETOS","PG_REL_CUSTOS", "PG_REL_EQUIPE")
			.and()
			.withUser("rafael").password("123").roles("PG_PROJETOS", "PG_REL_EQUIPE");
	}
}
