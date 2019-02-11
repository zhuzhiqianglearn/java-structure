// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JedisUtil123.java

package 9002914D56686A215F0F.4FEE6539987976EE7684redis7684Util;

import java.io.PrintStream;
import redis.clients.jedis.*;

public class JedisUtil123
{
	private static class ChoosePool
	{

		static JedisPool pool = null;
		static JedisPool pool2 = null;

		static 
		{
			JedisPoolConfig config = new JedisPoolConfig();
			config.setMaxIdle(256);
			config.setMaxWaitMillis(5000L);
			config.setTestOnBorrow(true);
			config.setTestOnReturn(true);
			config.setTestWhileIdle(true);
			config.setMinEvictableIdleTimeMillis(60000L);
			config.setTimeBetweenEvictionRunsMillis(3000L);
			config.setNumTestsPerEvictionRun(-1);
			pool = new JedisPool(config, "127.0.0.1", 6379, 60000);
			JedisPoolConfig config2 = new JedisPoolConfig();
			config2.setMaxIdle(256);
			config2.setMaxWaitMillis(5000L);
			config2.setTestOnBorrow(true);
			config2.setTestOnReturn(true);
			config2.setTestWhileIdle(true);
			config2.setMinEvictableIdleTimeMillis(60000L);
			config2.setTimeBetweenEvictionRunsMillis(3000L);
			config2.setNumTestsPerEvictionRun(-1);
			pool2 = new JedisPool(config2, "192.168.1.36", 60000, 60000);
		}

		private ChoosePool()
		{
		}
	}


	public JedisUtil123()
	{
	}

	public static void close(Jedis jedis, String choose)
	{
		try
		{
			getIntance(choose).returnResource(jedis);
		}
		catch (Exception e)
		{
			if (jedis.isConnected())
			{
				jedis.quit();
				jedis.disconnect();
			}
		}
	}

	public static String get(String key, String choose)
	{
		String value;
		Jedis jedis;
		value = null;
		jedis = null;
		JedisPool intance = getIntance(choose);
		System.out.println((new StringBuilder()).append(choose).append("-----------").append(intance).toString());
		jedis = getIntance(choose).getResource();
		value = jedis.get(key);
		close(jedis, choose);
		break MISSING_BLOCK_LABEL_95;
		Exception e;
		e;
		getIntance(choose).returnBrokenResource(jedis);
		e.printStackTrace();
		close(jedis, choose);
		break MISSING_BLOCK_LABEL_95;
		Exception exception;
		exception;
		close(jedis, choose);
		throw exception;
		return value;
	}

	public static void set(String key, String value, String choose)
	{
		Jedis jedis = null;
		jedis = getIntance(choose).getResource();
		jedis.set(key, value);
		close(jedis, choose);
		break MISSING_BLOCK_LABEL_58;
		Exception e;
		e;
		getIntance(choose).returnBrokenResource(jedis);
		e.printStackTrace();
		close(jedis, choose);
		break MISSING_BLOCK_LABEL_58;
		Exception exception;
		exception;
		close(jedis, choose);
		throw exception;
	}

	public static JedisPool getIntance(String name)
	{
		if (name.equals("online"))
			return ChoosePool.pool;
		else
			return ChoosePool.pool2;
	}
}
