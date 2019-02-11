package 适配器模式.修改项目的redis的Util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil1234 {
	static JedisPool pool=null;
	static  {
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(256);//20
		config.setMaxWaitMillis(5000L);
		config.setTestOnBorrow(true);
		config.setTestOnReturn(true);
		config.setTestWhileIdle(true);
		config.setMinEvictableIdleTimeMillis(60000l);
		config.setTimeBetweenEvictionRunsMillis(3000l);
		config.setNumTestsPerEvictionRun(-1);
		pool=new JedisPool(config, "127.0.0.1", 6379, 60000);
	}

	public static void close(Jedis jedis,String choose) {
		try {
			pool.returnResource(jedis);
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
	public static String get(String key,String choose) {
		String value = null;
		Jedis jedis = null;
		try {
			JedisPool intance = pool;
			System.out.println(choose+"-----------"+intance);
			jedis = pool.getResource();
			value = jedis.get(key);
		} catch (Exception e) {
			//释放redis对象
			pool.returnBrokenResource(jedis);
			e.printStackTrace();
		} finally {
			//返还到连接池
			close(jedis,choose);
		}
		return value;
	}

	public static void set(String key, String value,String choose) {
		Jedis jedis = null;
		try {
			jedis = pool.getResource();
			jedis.set(key, value);
		} catch (Exception e) {
			//释放redis对象
			pool.returnBrokenResource(jedis);
			e.printStackTrace();
		} finally {
			//返还到连接池
			close(jedis,choose);
		}
	}


}