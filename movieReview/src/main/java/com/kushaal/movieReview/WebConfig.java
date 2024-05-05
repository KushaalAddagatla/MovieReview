package com.kushaal.movieReview;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@CrossOrigin
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Specify the URL pattern you want to allow CORS for
                .allowedOrigins("http://localhost:3000")  // Specify the origin you want to allow
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Specify the HTTP methods you want to allow
                .allowCredentials(true);  // Specify whether credentials (like cookies) are allowed to be sent along with the request
    }
}
