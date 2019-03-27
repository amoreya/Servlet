import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/*
 *用于登录验证
 * 其中userid表示登录过后存入session的属性，login.jsp表示登录页面
 * */
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException { }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {//执行过滤
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        if (session.getAttribute("userid") != null) {
            filterChain.doFilter(request, response);//将请求继续传递
        }else {
            request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }
    @Override
    public void destroy() { }
}
