package edu.khcom.jpadao.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Value("${upload-img}")
    private String uploadImg;//

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // resource 경로에 저장된 파일을 직접적으로 접근
        registry.addResourceHandler("/upload/**")
                .addResourceLocations("file:" + uploadImg+"/");

    }


}
