package com.basarsoft.issuemanagement.controller;

import com.basarsoft.issuemanagement.service.UserServiceImpl;
import com.basarsoft.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ApiPaths.UserCtrl.CTRL)
@Api(value = ApiPaths.UserCtrl.CTRL)
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService){
        this.userService = userService;
    }


}
