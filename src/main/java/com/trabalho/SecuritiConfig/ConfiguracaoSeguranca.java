package com.trabalho.SecuritiConfig;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationTrustResolverImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;





@Configuration
@EnableWebMvcSecurity
public class ConfiguracaoSeguranca extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests()
		
		
		                                                               
			                                      
			                                        
			
			.antMatchers("/").permitAll() //ControladorNavegacao.java		
			.antMatchers("/admin").hasRole("ADMINISTRADOR")	//ControladorNavegacao.java 		
			.antMatchers("/userAtividade").hasRole("PROFESSOR")// AlunoSemanaAcademicaControle.java
			.antMatchers("/alunoAtividade").hasRole("COMUM")// UsuarioAtividadeControle.java
			
			.anyRequest().authenticated()		
			
			  .and().formLogin().loginPage("/login").permitAll()//ControladorNavegacao.java		  	  
			  .usernameParameter("username").passwordParameter("password")
			.and()
			  .logout().permitAll();
			  
		
				
		
		
			
		
	}
	
	
	
	@Autowired
	DataSource dataSource;
	
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
			 
		 
		 auth.jdbcAuthentication().dataSource(dataSource)
		 .usersByUsernameQuery
		 ("select usuario,senha,1 from login where usuario = ?")// tabela login no banco	 
		 
		 .authoritiesByUsernameQuery
		 ("select usuario,tipo from login where usuario = ?");	// tabela login no banco
		 
		 
			 
	}
	 

}
