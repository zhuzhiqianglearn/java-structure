package 适配器模式.修改项目的redis的Util;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolMy extends JedisUtil123 {
  private static JedisPool jedisPool;
  static {
      JedisPoolConfig config = new JedisPoolConfig();
      config.setMaxTotal(5000);
      config.setMaxIdle(256);//20
      config.setMaxWaitMillis(5000L);
      config.setTestOnBorrow(true);
      config.setTestOnReturn(true);
      config.setTestWhileIdle(true);
      config.setMinEvictableIdleTimeMillis(60000l);
      config.setTimeBetweenEvictionRunsMillis(3000l);
      config.setNumTestsPerEvictionRun(-1);
      jedisPool = new JedisPool(config, "192.168.1.36", 60000, 60000);
  }

}
