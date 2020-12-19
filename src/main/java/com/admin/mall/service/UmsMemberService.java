package com.admin.mall.service;

import com.admin.mall.common.api.CommonResult;

/**
 * @author Lyy
 * 会员管理Service
 * @date 2020/12/19 21:25
 **/
public interface UmsMemberService {

    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generatrAuthcode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifAuthCode(String telephone , String authCode);
}
