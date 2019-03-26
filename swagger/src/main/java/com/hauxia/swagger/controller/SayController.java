package com.hauxia.swagger.controller;

import com.google.common.util.concurrent.RateLimiter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.TimeUnit;

/**
 * @author wangxiansheng
 * @create 2019-03-22 1:04
 */
@Controller
@RequestMapping("/say")
@Api("sayController | 一个用来测试sawgger注解的控制器")
public class SayController {

    // 基于令牌桶算法的限流类,10表示每秒只能处理十个请求
    RateLimiter rateLimiter = RateLimiter.create(10);

    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据编号获取用户名称", notes = "test: 仅有1和2有正确返回")
    @ApiImplicitParam(paramType = "query", name = "userNumber", value = "用户编号", required = true, dataType = "Integer")
    public String getUserName(@RequestParam Integer userNumber) {

        // 调用acquire(),从令牌桶中
        System.out.println("等待:" + rateLimiter.acquire());

        if (userNumber == 1) {
            return "张三丰";
        } else if (userNumber == 2) {
            return "慕容复";
        } else {
            return "未知";
        }
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "修改用户密码", notes = "根据用户ID修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "userId", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "password", value = "用户旧密码", required = true, dataType = "String"),
            @ApiImplicitParam(paramType = "query", name = "newPassword", value = "用户新密码", required = true, dataType = "String")
    })
    public String updatePassword(@RequestParam("userId") Integer userId,
                                 @RequestParam("password") String password,
                                 @RequestParam("newPassword") String newPassword) {
        if (userId <= 0 || userId > 2) {
            return "未知的用户";
        }

        if (StringUtils.isEmpty(password) || StringUtils.isEmpty(newPassword)) {
            return "密码不能为空";
        }
        if (password.equals(newPassword)) {
            return "新旧密码不能相同";
        }
        return "密码修改成功!";
    }

    @ApiOperation(value = "测试限流,用户秒杀", notes = "用户请求超过桶中的令牌后,并且在一定时间内得不到,则抛出异常")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "count", value = "购买数量", required = true, dataType = "Integer"),
            @ApiImplicitParam(paramType = "query", name = "code", value = "购买商品的标志", required = true, dataType = "String")
    })
    @RequestMapping("/buy")
    public String miaosha(@RequestParam("count") int count, @RequestParam("code") String code) {
        if (!rateLimiter.tryAcquire(1000, TimeUnit.MILLISECONDS)) {
            System.out.println("sorry~,本次抢购失败,请重新抢购");
            return "false";
        }
        // 判断库存是否充足

        return "ture";
    }

}
