package m;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisTest {

	public static String callRedis (String name){
		String output;
        JedisPool pool = new JedisPool("192.168.16.1", 6379);
        try (Jedis jedis = pool.getResource()) {
            jedis.set("clientName", name);
            output=jedis.get("clientName");
        }
		return output;
	}
}
