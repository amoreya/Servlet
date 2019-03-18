import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTest", urlPatterns = "/Demo",
        initParams = {@WebInitParam(name = "admin", value = "yqh"),
                @WebInitParam(name = "email", value = "1290341092@qq.com")
        }
)
public class ServletTest implements Servlet {
        private transient ServletConfig servletConfig;

        @Override
        public ServletConfig getServletConfig(){
                return servletConfig;
        }
        @Override
        public void init(ServletConfig servletConfig) throws ServletException {
                this.servletConfig=servletConfig;

        }
        @Override
        public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
                ServletConfig servletConfig =getServletConfig();
                String admin=servletConfig.getInitParameter("admin");
                String email=servletConfig.getInitParameter("email");
                response.setContentType("text/html");
                PrintWriter writer=response.getWriter();
                writer.print("<html><head></head><body>"+"admin"+admin+"<br>Email"+email+"</body></html>");
        }
        @Override
        public String getServletInfo(){
                return "555555555";
        }
        @Override
        public void destroy(){

        }
}
