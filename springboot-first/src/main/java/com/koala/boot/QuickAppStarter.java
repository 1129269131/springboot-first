package com.koala.boot;

import com.koala.boot.config.SpringConfig;
import com.koala.boot.config.SpringMVCConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * day03
 * Create by koala on 2021-07-30
 */
public class QuickAppStarter extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override //根容器的配置（Spring的配置文件===Spring的配置类）
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{SpringConfig.class};
    }

    @Override //web容器的配置（SpringMVC的配置文件===SpringMVC的配置类）
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringMVCConfig.class};
    }

    @Override //Servlet的映射，DispatcherServlet的映射路径
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
