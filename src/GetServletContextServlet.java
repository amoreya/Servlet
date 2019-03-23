import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
;


/**
 * 获取ServletContext对象
 * @method 通过重GenericServlet继承来的getServletContext()
 * */

@WebServlet(name = "GetServletContextServlet", urlPatterns = "/application")
public class GetServletContextServlet extends HttpServlet {


    /*
    * 覆写了生命周期init()方法，注意覆写非生命周期init()方法的区别
    * */
    public void init(ServletConfig config) throws ServletException{
       super.init(config);//调用父类的生命周期方法init(),初始化ServletConfig对象
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext app = getServletContext();
        System.out.println("真实路径 ： " + app.getRealPath("/6666666"));
        //getRealPath（）的参数代表在真实路径后面添加的字符串内容
    }


}
