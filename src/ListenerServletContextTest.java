import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/*
* 对ServletContext进行监听
* */
@WebListener
public class ListenerServletContextTest implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        System.out.println("容器初始化" + event.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        System.out.println("容器销毁" + event.getServletContext().getContextPath());
    }
}
