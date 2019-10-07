package com.xzw.gmall.user.mapper;

import com.xzw.gmall.user.bean.dto.Member;

import java.util.List;

public interface MemberMapper  {
    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    int insertSelective(Member record);

    Member selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    List<Member> selectAllUser();
}