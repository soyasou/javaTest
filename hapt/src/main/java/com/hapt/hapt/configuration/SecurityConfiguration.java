
package com.hapt.hapt.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import javax.sql.DataSource;

@Configuration
/** classe du configuration */
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    /** import data source */
    @Autowired
    private DataSource dataSource;

    @Autowired
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder()).dataSource(dataSource)
                .usersByUsernameQuery("SELECT email, password,active  FROM horizonapp.user where email=?")
                .authoritiesByUsernameQuery("SELECT email, role  FROM horizonapp.user user where email=?");
    }

    /** debut security */
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/css/**", "/img/**", "/login").permitAll().anyRequest().authenticated()
                .and().formLogin().permitAll()
                // Login form
                .and().formLogin().loginPage("/login").usernameParameter("email").passwordParameter("password")
                // Fail, forbidden and Success actions
                .failureUrl("/login?error").defaultSuccessUrl("/").and().exceptionHandling()
                .accessDeniedPage("/forbidden")
                // Logout listener setting and action
                .and().logout().invalidateHttpSession(true).clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout")
                .permitAll()
                // CSRF disabling
                .and().csrf().disable();
    }
}