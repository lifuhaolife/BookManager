package xust.lfh.book_permission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @author: LFH
 * @date: 2020/3/30  23:30
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public  String  hello(){
        return "hello,world";
    }
}
