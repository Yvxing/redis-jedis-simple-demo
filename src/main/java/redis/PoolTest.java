package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class PoolTest {
    public static void main(String[] args) {
        JedisPool pool = new JedisPool("192.168.75.132");
        Jedis resource = pool.getResource();
//        有密码则在获取资源后设置密码
//        resource.auth("123");
                
        resource.set("pool1","testpool");

        resource.close();
        pool.close();

    }
}
