package 代理模式.动态代理;

public class DongtaiMain {
    public static void main(String[] args) {
        IUserDao iUserDao=new UserDao();
        ProxyFactory proxyFactory=new ProxyFactory(iUserDao);
        IUserDao proxy = (IUserDao) proxyFactory.getProxyINstance();
        proxy.save("11");
    }
}
