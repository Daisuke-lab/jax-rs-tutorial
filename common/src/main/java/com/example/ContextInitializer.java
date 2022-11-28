package com.example;
import java.io.Serializable;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class ContextInitializer implements ServletContextListener, Serializable  {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println(sce.getServletContext().getContextPath() + "：" + new Object() {
        }.getClass().getEnclosingClass().getName() + " is Called");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
