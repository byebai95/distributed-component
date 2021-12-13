package app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: bai
 * @Date: 2021/12/13 9:59
 */
@RestController
public class TestController {

    private static final AtomicInteger integer = new AtomicInteger(0);

    @GetMapping("/call")
    public void call(){
        System.out.println("call:"+integer.addAndGet(1));
    }
}
