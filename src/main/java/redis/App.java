package redis;

import redis.clients.jedis.Jedis;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Jedis jedis = new Jedis("192.168.75.132");

//        jedis.auth("123");    //若有密码 在执行前需要设置

        jedis.set("name1","xiaoxiao");
        jedis.close();
    }
}
