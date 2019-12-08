package com.example.swagger.demo.controller;

import com.example.swagger.demo.model.request.UserRequestModel;
import com.example.swagger.demo.model.response.UserRest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping(path = "/{id}")
    @ApiOperation(value="Get User by id",
            notes = "Provide an id to look up specific user")
    public String getUser(@ApiParam(value = "User id") @PathVariable String id){
        return "get " + id;
    }

    @PostMapping("/")
    @ApiOperation(value="Post User for create user",
            notes = "Provide an user payload to create new user")
    public UserRest createUser(@RequestBody UserRequestModel userRequestModel){
        UserRest returnValue = new UserRest();
        BeanUtils.copyProperties(userRequestModel, returnValue);
        return returnValue;
    }

}
