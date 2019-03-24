import javax.servlet.*;
import java.io.IOException;



/*
 *跟FilterFirst组合使用形成Filter链
 * */
public class FilterSecond  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {//初始化过滤器
        System.out.println("初始化一个过滤器-----FilterFSecond");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {//执行过滤
        System.out.println(" filterChain调用doFilter之前-----FilterFSecond");
        filterChain.doFilter(servletRequest ,servletResponse);//将请求继续传递
        System.out.println(" filterChain调用doFilter之后-----FilterFSecond");
    }

    @Override
    public void destroy() {//销毁过滤
        System.out.println("过滤器销毁-----FilterFSecond");
    }
}

