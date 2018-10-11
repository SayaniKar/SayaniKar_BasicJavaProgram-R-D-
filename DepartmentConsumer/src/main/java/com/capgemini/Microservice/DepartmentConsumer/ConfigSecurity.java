package com.capgemini.Microservice.DepartmentConsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
public class ConfigSecurity extends WebSecurityConfigurerAdapter {
@Override
protected void configure(HttpSecurity http) throws Exception{
	
	http.csrf().disable().authorizeRequests().antMatchers("/producer/show").hasAnyRole("admin")
	.and().formLogin();
}
@Autowired
public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
{
	auth.inMemoryAuthentication().withUser("Sayani").password("pass@123").roles("user");
	auth.inMemoryAuthentication().withUser("Urmi").password("pass@225").roles("admin");
}

}