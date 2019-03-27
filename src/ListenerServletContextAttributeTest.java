import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/*
* 与add.jsp,remove.jsp,replace.jsp配合演示对Servlet Context上下文属性的监听
* */
@WebListener
public class ListenerServletContextAttributeTest implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event){
        System.out.println("增加属性："+event.getName()+"属性内容："+event.getValue());
    }
    @Override
    public void attributeRemoved(ServletContextAttributeEvent event){
        System.out.println("删除属性："+event.getName()+"属性内容："+event.getValue());
    }
    @Override
    public void attributeReplaced(ServletContextAttributeEvent event){
        System.out.println("替换属性："+event.getName()+"属性内容："+event.getValue());
    }
}
