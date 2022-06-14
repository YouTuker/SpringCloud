package com.example.initial_test.Config;

import com.example.initial_test.Interceptor.BookInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class BookInterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private BookInterceptor bookInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(bookInterceptor)
                .addPathPatterns("/book")
                .excludePathPatterns("/books");
    }
}
