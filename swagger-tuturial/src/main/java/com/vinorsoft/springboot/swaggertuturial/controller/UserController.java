package com.vinorsoft.springboot.swaggertuturial.controller;

import com.vinorsoft.springboot.swaggertuturial.entity.User;
import com.vinorsoft.springboot.swaggertuturial.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@Api(value = "User APIs")
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "Xem danh sách User", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Thành công"),
            @ApiResponse(code = 401, message = "Chưa xác thực"),
            @ApiResponse(code = 403, message = "Truy cập bị cấm"),
            @ApiResponse(code = 404, message = "Không tìm thấy")
    })

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAllUser();
    }

    @ApiOperation(value = "Thêm User", response = List.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Thành công"),
            @ApiResponse(code = 401, message = "Chưa xác thực"),
            @ApiResponse(code = 403, message = "Truy cập bị cấm"),
            @ApiResponse(code = 404, message = "Không tìm thấy")
    })
    @PostMapping("/users")
    public User createUser(@ApiParam(value = "Đối tượng User cần tạo mới", required = true) @RequestBody User user) {
        return userService.saveUser(user);
    }

}
