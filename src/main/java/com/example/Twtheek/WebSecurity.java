//package com.example.Twtheek;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurity extends WebSecurityConfigurerAdapter {
//    @Autowired
//    private DataSource dataSource;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .csrf().disable()
//                .authorizeRequests().anyRequest().authenticated()
//                .and()
//                .httpBasic().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//    }
//
//
//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth
//                .jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery("select email,password,enabled from [master].[dbo].[users] where email=?")
//                .authoritiesByUsernameQuery("select email,authority from [master].[dbo].[users] where email=?")
//                .passwordEncoder(new BCryptPasswordEncoder());
//
//
////        auth.jdbcAuthentication().dataSource(dataSource)
////                .usersByUsernameQuery("select username, password, enabled"
////                        + " from users where username=?")
////                .authoritiesByUsernameQuery("select username, authority "
////                        + "from authorities where username=?")
////                .passwordEncoder(new BCryptPasswordEncoder());
////    }
////
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////
////        http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "ADMIN_ROLE")
////                .and()
////                .httpBasic(); // Authenticate users with HTTP basic authentication
////    }
//}
//
