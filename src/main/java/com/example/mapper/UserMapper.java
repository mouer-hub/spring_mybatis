package com.example.mapper;

import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> Sel(int no);
}
