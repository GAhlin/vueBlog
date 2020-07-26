package com.dangelion.shiro;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.apache.shiro.SecurityUtils;

/**
 * @Author Gavin
 * @Date 2020/7/26
 */
public class ShiroUtil {

    public static AccountProfile getProfile() {
        JSONObject jsonObject= JSONUtil.parseObj(SecurityUtils.getSubject().getPrincipal());
        return JSONUtil.toBean(jsonObject,AccountProfile.class) ;
    }
}
