package com.jiuzhang.seckill8jdk;

import com.jiuzhang.seckill8jdk.services.SeckillActivityService;
import com.jiuzhang.seckill8jdk.util.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedisDemoTest {

    @Autowired
    SeckillActivityService seckillActivityService;
    @Resource
    private RedisService redisService;


    @Test
    public void getStockTest(){
     String stock =  redisService.getValue("stock:19");
     System.out.println(stock);
    }

    @Test
    public void stockDeductValidatorTest(){
      boolean result =  redisService.stockDeductValidator("stock:19");
      System.out.println("result:"+result);
      String stock =  redisService.getValue("stock:19");
      System.out.println("stock:"+stock);
    }

    @Test
    public void pushSeckillInfoToRedisTest(){
        seckillActivityService.pushSeckillInfoToRedis(19);
    }

    @Test
    public void getSeckillInfoFromRedisTest(){
        String seckillInfo = redisService.getValue("seckillActivity:" + 19);
        System.out.println(seckillInfo);
        String seckillCommodity = redisService.getValue("seckillCommodity:"+1001);
        System.out.println(seckillCommodity);
    }
}
