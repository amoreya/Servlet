import javax.servlet.GenericServlet;
        import javax.servlet.ServletException;
        import javax.servlet.ServletRequest;
        import javax.servlet.ServletResponse;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.http.HttpSession;
        import java.io.IOException;


/*
 * 通过ServletRequest获得HttpSession
 * */
@WebServlet(name = "GetHttpSessionServletDemo",urlPatterns = "/resession")
public class ReGetHttpSessionServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{

        HttpServletRequest req=(HttpServletRequest)request;//将ServletRequest对象转换成HttpServletRequest
        HttpServletResponse rep=(HttpServletResponse)response;//将ServletResponse对象转换成HttpServletResponse
        HttpSession session=req.getSession();

        session.setAttribute("name", "yqh");
        System.out.println("通过将ServletRequest向下转型获取存到session的name：" + session.getAttribute("name"));

    }
}
