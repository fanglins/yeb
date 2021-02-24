package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xxxx.server.pojo.Admin;
import com.xxxx.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangwenqi
 * @since 2021-02-18
 */
public interface IAdminService extends IService<Admin> {
    //登录之后返回token
    RespBean login(String username, String password,HttpServletRequest request);

    //根据用户名获取用户信息
    Admin getAdminByUserName(String username);


}
