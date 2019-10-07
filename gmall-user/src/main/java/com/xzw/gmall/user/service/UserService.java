package com.xzw.gmall.user.service;

import com.xzw.gmall.user.bean.dto.Member;

import java.util.List;

public interface UserService {
    List<Member> selectAllUser();
}
