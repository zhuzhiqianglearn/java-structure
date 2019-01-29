package 代理模式.Cglib代理;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class CglibMain {
    public static void main(String[] args) {
        UserDao userDao=new UserDao();
        ProxyCglib proxyCglib=new ProxyCglib(userDao);
        UserDao userDao1= (UserDao) proxyCglib.getInstance();
        userDao1.save();
    }
}
