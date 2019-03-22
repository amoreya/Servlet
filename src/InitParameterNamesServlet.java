import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


/**
 * 用来取得配置的初始化信息
 *
 * @method getInitParameterNames
 */

@WebServlet(name = "InitParamServlet", urlPatterns = "/params",
        initParams = {@WebInitParam(name = "name", value = "yqh"),
                @WebInitParam(name = "phone", value = "13145201314"),
                @WebInitParam(name = "class", value = "03011703"),
                @WebInitParam(name = "sex", value = "男")
        }
)
public class InitParameterNamesServlet extends HttpServlet {
    private Enumeration enums = null;
    private transient ServletConfig config = null;//用来接收config对象,不然后面获取不到每一个参数的具体值

    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        enums = config.getInitParameterNames();

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String param = null;
        while (enums.hasMoreElements()) {
            param = (String) enums.nextElement();
            System.out.println("doGet获取的参数：" + param + " : " + config.getInitParameter(param));
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
