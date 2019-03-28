package com.lenovo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class ContextSessionRequestListener
 *
 */
@WebListener
public class ContextSessionRequestListener implements HttpSessionListener, ServletContextListener, ServletRequestListener {
	
   
	
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("监听ServletContext...创建Content对象："+arg0);
    }
    public void contextDestroyed(ServletContextEvent arg0)  { 
        // TODO Auto-generated method stub
    	System.out.println("监听ServletContext...销毁Content对象："+arg0);
   }

    /**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("监听Session...创建Session对象："+arg0);
    }
    
	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("监听Session...销毁Session对象："+arg0);
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("监听request...创建request对象："+arg0);
    }
    
    /**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("监听request...销毁request对象："+arg0);
    }



	
	
}
