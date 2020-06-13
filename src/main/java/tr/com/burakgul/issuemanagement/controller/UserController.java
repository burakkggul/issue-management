package tr.com.burakgul.issuemanagement.controller;

import tr.com.burakgul.issuemanagement.service.UserServiceImpl;
import tr.com.burakgul.issuemanagement.util.ApiPaths;
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
