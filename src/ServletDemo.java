import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletDemo implements Servlet {

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

        response.setContentType("text/html");//设置响应内容类型，告诉浏览器内容类型为HTML

        /*
         * 调用ServletResponse的getWriter方法，他返回了一个可以向客户端发送文本的java.io.PrintWriter。默认使用ISO-8859-1编码
         * */
        PrintWriter writer = response.getWriter();

        writer.print("<html><head></head><body>" + "hello Servlet" + "</body></html>");
    }

    @Override
    public String getServletInfo() {
        return "555555555";
    }

    @Override
    public void destroy() {

    }
}
