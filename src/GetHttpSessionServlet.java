import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
 * 通过HttpServletSession获得HttpSession
 * */
@WebServlet(name = "GetHttpSessionServlet", urlPatterns = "/session")
public class GetHttpSessionServlet extends HttpServlet {
    public void init() throws ServletException {
        System.out.println("sesssion的获取");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        HttpSession session = request.getSession();//HttpServletRequest接口调用getSession可以返回一个HttpSession
        session.setAttribute("name", "yqh");
        System.out.println("获取存到session的name：" + session.getAttribute("name"));
    }
}
