package com.koala.boot;

import com.koala.boot.servlet.HelloServlet;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

/**
 * day01
 * 怎么启动起来？
 * Tomcat启动
 * SPI机制下 QuickAppStarter生效创建 ioc容器配置 DispatcherServlet等各种组件
 *
 * 导入各种starter依赖，SpringBoot封装了很多的自动配置，帮我们给容器中放了很多组件。
 * SpringBoot封装了功能的自动配置
 *
 * WebServerFactory做到了
 * Create by koala on 2021-07-29
 */
public class Main01 {

    public static void main(String[] args) throws LifecycleException {
        //自己写Tomcat的启动源码
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8888);
        tomcat.setHostname("localhost");
        tomcat.setBaseDir(".");

        tomcat.addWebapp("/boot", System.getProperty("user.dir") + "/src/main");

        //给Tomcat里面添加一个Servlet
        Wrapper hello = tomcat.addServlet("/boot", "hello", new HelloServlet());
        hello.addMapping("/66"); //指定处理的请求

        tomcat.start();//启动tomcat 注解版MVC利用Tomcat SPI机制
        tomcat.getServer().await(); //服务器等待
    }

}
