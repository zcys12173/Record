package com.syc.record.common.SevletListener;

import com.syc.record.dao.DaoManager;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class CommonServletContextListener implements ServletContextListener,ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        DaoManager.getInstance().openConnect();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        DaoManager.getInstance().closeConnection();
    }
}
