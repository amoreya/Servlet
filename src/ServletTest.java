import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;



/**
 * Servlet3.0 默认不在有web.xml
 * 3.0中采用@webServlet注解的方式来配置一些相应的参数
 *
 *WebServlet注解用来声明一个Servle。命名Servlet时，还可以暗示容器，是哪个URL调用这个Servlet
 *name属性是可选的，如果写的话，一般是该Servlet的名称
 *重要的是urlPatterns属性，他也是可选的但是一般都要有，在ServletTest中urlPatterns告诉容器，/Demo样式表示应该调用该servlet
 * initParams指定一组 Servlet 初始化参数
 * @WebInitParam 用来配置 initParams name为InitParameter名字，value为值，之间用特殊符号隔开，这里用逗号。
 * 这个就相当于在xml中写入：
 * <servlet><!-- 定义servlet-->
 *     <servlet-name>hello</servlet-name><!-- 与servlet-mapping相对应-->
 *     <servlet-class><!-- 定义包.类名称-->
 *         ServletTest<!-- 我这个Servlet没有包所以直接写类名-->
 *     </servlet-class>
 *     <init-param><!-- 定义初始化参数-->
 *       <param-name>admin</param-name><!-- 表明初始化参数的名字-->
 *       <param-value>yqh</param-value><!-- 参数对应的值->
 *     </init-param>
 *      <init-param>
 *  *       <param-name>email</param-name>
 *  *       <param-value>1290341092@qq.com</param-value>
 *  *     </init-param>
 *   </servlet>
 *   <servlet-mapping><!-- 映射路径-->
 *     <servlet-name>hello</servlet-name><!-- 与servlet相对应-->
 *     <url-pattern>/Demo</url-pattern><!-- 页面的映射路径-->
 *   </servlet-mapping>
 *
 */
@WebServlet(name = "ServletTest", urlPatterns = "/Demo",
        initParams = {@WebInitParam(name = "admin", value = "yqh"),
                @WebInitParam(name = "email", value = "1290341092@qq.com")
        }
)
public class ServletTest implements Servlet {
    private transient ServletConfig servletConfig;

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;

    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        ServletConfig servletConfig = getServletConfig();
        String admin = servletConfig.getInitParameter("admin");
        String email = servletConfig.getInitParameter("email");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.print("<html><head></head><body>" + "admin" + admin + "<br>Email" + email + "</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "555555555";
    }

    @Override
    public void destroy() {

    }
}
