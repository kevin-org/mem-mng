package com.kevin.mem.mng.controller;

import com.kevin.mem.mng.business.UserBusiness;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Api(description = "用户管理接口")
public class UserController extends BaseController {

    @Autowired
    private UserBusiness userBusiness;
}
