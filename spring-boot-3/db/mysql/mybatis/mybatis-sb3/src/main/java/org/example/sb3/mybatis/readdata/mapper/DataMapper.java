package org.example.sb3.mybatis.readdata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.sb3.mybatis.domain.User;

import java.util.List;

/**
 * @Author: zongz
 * @Date: 2025-03-01
 */
@Mapper
public interface DataMapper {
    // 分页查询方法
    @Select("SELECT * FROM t_user LIMIT #{limit} OFFSET #{offset}")
    List<User> selectByPage(@Param("offset") int offset, @Param("limit") int limit);

    // 获取总记录数
    @Select("SELECT COUNT(*) FROM t_user")
    int totalCount();

    // 游标分页查询（基于有序ID）
    @Select("SELECT * FROM User WHERE id > #{lastId} ORDER BY id ASC LIMIT #{limit}")
    List<User> selectByCursor(@Param("lastId") long lastId, @Param("limit") int limit);

    // 获取最小ID（起始点）
    @Select("SELECT MIN(id) FROM User")
    long selectMinId();

    // 获取最大ID（终点）
    @Select("SELECT MAX(id) FROM User")
    long selectMaxId();
}
