package 适配器模式.修改项目的redis的Util;

import redis.clients.jedis.Jedis;

public interface JedisInterface {
    public  Jedis getConn();
    public  void close(Jedis jedis);
    public  void set(String key, String value);
    public  String get(String key);
}
