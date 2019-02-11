package 适配器模式.修改项目的redis的Util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtil12345 extends JedisUtil1234{
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
		pool=new JedisPool(config, "192.168.1.36", 60000, 60000);
	}

	public static void main(String[] args) {
		JedisUtil12345.set("h2","123","21321");
		JedisUtil1234.set("h2","1234","12345");
		System.out.println(JedisUtil12345.get("h2","23123"));
		System.out.println(JedisUtil1234.get("h2","23123"));
	}


}