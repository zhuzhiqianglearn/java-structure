package 代理模式.动态代理;

public class UserDao implements IUserDao {
    public void save() {
        System.out.println("----已经保存数据!----");
    }

    @Override
    public void save(String data) {
        System.out.println("----已经保存数据!----"+data);
    }
}
