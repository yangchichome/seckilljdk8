package com.jiuzhang.seckill8jdk.web;

import com.alibaba.csp.sentinel.Entry;
import com.alibaba.csp.sentinel.SphU;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        String result;
        try (Entry entry = SphU.entry("HelloResource")){
            result = "Hello Sentinel";
            return result;
        }catch (BlockException ex) {
            log.error(ex.toString());
            return "wait";
        }
    }
}
