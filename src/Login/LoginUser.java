package Login;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/*
* 利用HttpSessionBindingListener对登录用户一对一的监听
* */
public class LoginUser implements HttpSessionBindingListener {
    private String username;

    public LoginUser(String username){
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event){
        System.out.println("在session中保存LoginUser对象(name ="+this.getUsername()+" ),session id ="+event.getSession().getId());

    }
    @Override
    public void valueUnbound(HttpSessionBindingEvent event){
        System.out.println("在session中移除LoginUser对象(name ="+this.getUsername()+" ),session id ="+event.getSession().getId());
    }
}
