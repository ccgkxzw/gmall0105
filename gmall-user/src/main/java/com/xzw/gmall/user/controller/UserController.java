package com.xzw.gmall.user.controller;

import com.xzw.gmall.user.bean.dto.Member;
import com.xzw.gmall.user.mapper.MemberMapper;
import com.xzw.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        List<Member> umsMember= userService.selectAllUser();
        return String.valueOf(umsMember);
    }
}
