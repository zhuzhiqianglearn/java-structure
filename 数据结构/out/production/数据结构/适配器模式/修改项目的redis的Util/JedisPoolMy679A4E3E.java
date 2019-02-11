// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   JedisPoolMy679A4E3E.java

package 9002914D56686A215F0F.4FEE6539987976EE7684redis7684Util;

import java.io.PrintStream;
import redis.clients.jedis.*;

public final class JedisPoolMy679A4E3E extends Enum
{

	public static final JedisPoolMy679A4E3E ONLINE;
	public static final JedisPoolMy679A4E3E BENDI;
	public static final JedisPoolMy679A4E3E ONLINE50;
	private JedisPool jedisPool;
	private static final JedisPoolMy679A4E3E $VALUES[];

	public static JedisPoolMy679A4E3E[] values()
	{
		return (JedisPoolMy679A4E3E[])$VALUES.clone();
	}

	public static JedisPoolMy679A4E3E valueOf(String name)
	{
		return (JedisPoolMy679A4E3E)Enum.valueOf(9002914D56686A215F0F/4FEE6539987976EE7684redis7684Util/JedisPoolMy679A4E3E, name);
	}

	private JedisPoolMy679A4E3E(String s, int i, String adress, int port)
	{
		super(s, i);
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(5000);
		config.setMaxIdle(256);
		config.setMaxWaitMillis(5000L);
		config.setTestOnBorrow(true);
		config.setTestOnReturn(true);
		config.setTestWhileIdle(true);
		config.setMinEvictableIdleTimeMillis(60000L);
		config.setTimeBetweenEvictionRunsMillis(3000L);
		config.setNumTestsPerEvictionRun(-1);
		jedisPool = new JedisPool(config, adress, port, 60000);
	}

	public void close(Jedis jedis)
	{
		try
		{
			jedisPool.returnResource(jedis);
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

	public String get(String key)
	{
		String value;
		Jedis jedis;
		value = null;
		jedis = null;
		jedis = jedisPool.getResource();
		value = jedis.get(key);
		close(jedis);
		break MISSING_BLOCK_LABEL_59;
		Exception e;
		e;
		jedisPool.returnBrokenResource(jedis);
		e.printStackTrace();
		close(jedis);
		break MISSING_BLOCK_LABEL_59;
		Exception exception;
		exception;
		close(jedis);
		throw exception;
		return value;
	}

	public void set(String key, String value, String leibie)
	{
		Jedis jedis = null;
		jedis = jedisPool.getResource();
		jedis.set(key, value);
		System.out.println((new StringBuilder()).append(jedisPool.getClass()).append("------").append(leibie).toString());
		close(jedis);
		break MISSING_BLOCK_LABEL_100;
		Exception e;
		e;
		jedisPool.returnBrokenResource(jedis);
		e.printStackTrace();
		close(jedis);
		break MISSING_BLOCK_LABEL_100;
		Exception exception;
		exception;
		close(jedis);
		throw exception;
	}

	static 
	{
		ONLINE = new JedisPoolMy679A4E3E("ONLINE", 0, "192.168.1.36", 60000);
		BENDI = new JedisPoolMy679A4E3E("BENDI", 1, "127.0.0.1", 6379);
		ONLINE50 = new JedisPoolMy679A4E3E("ONLINE50", 2, "192.168.1.50", 60000);
		$VALUES = (new JedisPoolMy679A4E3E[] {
			ONLINE, BENDI, ONLINE50
		});
	}
}
