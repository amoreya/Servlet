

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*
*用来观察一个Servlet程序的生命周期的运行过程,并配置自动加载
* */
@WebServlet(name="LifeCycleServlet",urlPatterns="/life",loadOnStartup = 1)

public class LifeCycleServlet implements Servlet {
    private transient ServletConfig servletConfig;


    /**
     * 当容器启动的时候或者第一次使用这个Servlet的时候会调用此方法进行初始化信息，重复请求时也只会调用一次（第一次）
     */
    @Override
    public  void    init(ServletConfig servletConfig)  throws ServletException{
        this.servletConfig = servletConfig;
        System.out.println("Servlet---------->初始化");
    }

    /*
    * 当客户端请求服务的时候会调用此方法，重复请求时重复调用此方法
    * */
    @Override
    public  void service(ServletRequest request, ServletResponse response)throws ServletException,IOException{
        System.out.println("Servlet---------->调用服务");
    }

    /*
    * 当容器关闭的时候或者web应用程序从容器中删除的时候调用此方法
    * */
    @Override
    public  void destroy(){
        System.out.println("Servlet---------->销毁");
    }

    @Override
    public String getServletInfo() {
        return "这是一个Servlet";
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }
}
