

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public enum  JedisPoolMy{
    ONLINE("192.168.1.36",60000),BENDI("127.0.0.1",6379),ONLINE50("192.168.1.50",60000);
    private  JedisPool jedisPool;
    JedisPoolMy(String adress,int port) {
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
        jedisPool = new JedisPool(config, adress, port, 60000);
    }

    public  void close(Jedis jedis) {
        try {
            jedisPool.returnResource(jedis);
        } catch (Exception e) {
            if (jedis.isConnected()) {
                jedis.quit();
                jedis.disconnect();
            }
        }
    }
    /**
     * 获取数据
     * @param key
     * @return
     */
    public  String get(String key) {
        String value = null;
        Jedis jedis = null;
        try {

            jedis = jedisPool.getResource();
            value = jedis.get(key);
        } catch (Exception e) {
            //释放redis对象
            jedisPool.returnBrokenResource(jedis);
            e.printStackTrace();
        } finally {
            //返还到连接池
            close(jedis);
        }
        return value;
    }

    public  void set(String key, String value,String leibie) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
            System.out.println(jedisPool.getClass()+"------"+leibie);
        } catch (Exception e) {
            //释放redis对象
            jedisPool.returnBrokenResource(jedis);
            e.printStackTrace();
        } finally {
            //返还到连接池
            close(jedis);
        }
    }


}
  
