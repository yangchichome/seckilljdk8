package com.jiuzhang.seckill8jdk;

import com.jiuzhang.seckill8jdk.util.RedisService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedisDemoTest {

    @Resource
    private RedisService redisService;

    @Test
    public void setTest(){
        redisService.setValue("stock:19",10L);
    }

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

}
