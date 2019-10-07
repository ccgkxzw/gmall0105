package com.xzw.gmall.user.service.impl;

import com.xzw.gmall.user.bean.dto.Member;
import com.xzw.gmall.user.mapper.MemberMapper;
import com.xzw.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    MemberMapper memberMapper;

    @Override
    public List<Member> selectAllUser() {
        List<Member> members = memberMapper.selectAllUser();
//        List<Member> members = memberMapper.selectAll();
        return members;
    }
}
