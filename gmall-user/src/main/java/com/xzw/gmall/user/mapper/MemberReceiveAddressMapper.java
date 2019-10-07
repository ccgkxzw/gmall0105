package com.xzw.gmall.user.mapper;

import com.xzw.gmall.user.bean.dto.MemberReceiveAddress;

public interface MemberReceiveAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberReceiveAddress record);

    int insertSelective(MemberReceiveAddress record);

    MemberReceiveAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberReceiveAddress record);

    int updateByPrimaryKey(MemberReceiveAddress record);
}