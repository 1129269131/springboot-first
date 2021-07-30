package com.koala.boot;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * day02
 * Create by koala on 2021-07-29
 */
public class Main02 {

    public static void main(String[] args) throws LifecycleException {
        //自己写Tomcat的启动源码
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8888);
        tomcat.setHostname("localhost");
        tomcat.setBaseDir(".");

        tomcat.addWebapp("/boot", System.getProperty("user.dir") + "/src/main");

        //自己创建 DispatcherServlet 对象，并且创建ioc容器，DispatcherServlet里面有ioc容器
        DispatcherServlet servlet = new DispatcherServlet();

        //给Tomcat里面添加一个Servlet
        Wrapper hello = tomcat.addServlet("/boot", "hello", servlet);
        hello.addMapping("/66"); //指定处理的请求

        tomcat.start();//启动tomcat 注解版MVC利用Tomcat SPI机制
        tomcat.getServer().await(); //服务器等待
    }

}
