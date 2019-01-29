package 代理模式.Cglib代理;

import 代理模式.动态代理.IUserDao;

public class UserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }

}
