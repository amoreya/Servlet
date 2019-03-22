import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用来取得配置的初始化信息
 * @method getInitParameter
 * */

@WebServlet(name = "InitParamServlet", urlPatterns = "/param",
        initParams = {@WebInitParam(name = "name", value = "yqh"),
                @WebInitParam(name = "phone", value = "13145201314")
        }
)
public class InitParamServlet extends HttpServlet {

        private String name=null;
        private String phone=null;

        public  void    init(ServletConfig config) throws ServletException{
        name = config.getInitParameter("name");
        phone = config.getInitParameter("phone");
        }

        public void  doGet(HttpServletRequest request, HttpServletResponse response) throws
                ServletException, IOException{
                System.out.println("doGet获取初始化参数 ：name ："+name+" phone : "+phone );
        }
        public void  doPost(HttpServletRequest request, HttpServletResponse response) throws
                ServletException, IOException{
                System.out.println("doPost获取初始化参数 ：name ："+name+" phone : "+phone );
        }
}
