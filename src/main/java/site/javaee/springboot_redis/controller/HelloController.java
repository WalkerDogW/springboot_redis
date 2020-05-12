package site.javaee.springboot_redis.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import site.javaee.springboot_redis.pojo.User;


/**
 * @author Tao
 * @create 2020/4/23 20:27
 */

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "index";
    }

    //只要接口返回值中存在实体类，就会被扫描到swagger的models
    @PostMapping("/user/{username}")
    @ApiOperation("新增hello用户")
    public User user(@ApiParam("用户名") @PathVariable("username") String username){
        return  new User(1L,username,"123456");
    }
}
