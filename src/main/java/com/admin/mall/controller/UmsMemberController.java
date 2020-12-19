package com.admin.mall.controller;

import com.admin.mall.common.api.CommonResult;
import com.admin.mall.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lyy
 * 会员登录注册管理Controller
 * @date 2020/12/19 21:43
 **/
@Controller
@Api(tags = "UmsMemberController",description = "会员登录注册管理")
@RequestMapping("/sso")
public class UmsMemberController {

    @Autowired
    private UmsMemberService umsMemberService;

    @ApiOperation("获取验证码")
    @GetMapping("/getAuthcode")
    public CommonResult getAuthCode(@RequestParam String telephone){
        return umsMemberService.generatrAuthcode(telephone);
    }

    public CommonResult updatePassword(@RequestParam String telephone,
                                       @RequestParam String authCode){
        return umsMemberService.verifAuthCode(telephone, authCode);
    }

}
