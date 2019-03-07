package com.example.mybatisTest.dao;

import com.example.mybatisTest.model.UserCopy;
import com.example.mybatisTest.model.UserCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserCopyMapper extends Mapper<UserCopy> {
    long countByExample(UserCopyExample example);

    int deleteByExample(UserCopyExample example);

    List<UserCopy> selectByExample(UserCopyExample example);

    int updateByExampleSelective(@Param("record") UserCopy record, @Param("example") UserCopyExample example);

    int updateByExample(@Param("record") UserCopy record, @Param("example") UserCopyExample example);
}