import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/*
 * 用来统一全站编码的Filter
 * */
public class CharacterEncondingFilter implements Filter {
    private FilterConfig filterConfig = null;
    private String defaultCharset = "UTF-8";

    @Override
    public void init(FilterConfig config) throws ServletException {
      filterConfig=config;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {//执行过滤
        HttpServletRequest request =(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        String charset=filterConfig.getInitParameter("charset");
        if (charset==null){
            charset=defaultCharset;
        }
        request.setCharacterEncoding(charset);
        response.setCharacterEncoding(charset);

        filterChain.doFilter(request, response);//将请求继续传递
    }

    @Override
    public void destroy() {
    }
}


