package com.jiuzhang.seckill8jdk;

import com.jiuzhang.seckill8jdk.services.SeckillActivityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PayOrderTest {

    @Autowired
    private SeckillActivityService seckillActivityService;

    @Test
    public void payOrderTest(){
        seckillActivityService.payOrderProcess("869749080241344512");
    }
}
