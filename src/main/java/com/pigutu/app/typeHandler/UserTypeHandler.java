package com.pigutu.app.typeHandler;

import com.google.common.collect.ImmutableMap;
import com.google.gson.Gson;
import com.pigutu.app.xforum.dao.XUserDao;
import com.pigutu.app.xforum.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


@Slf4j
public class UserTypeHandler extends BaseTypeHandler<User> {
    @Autowired
    XUserDao xUserDao;
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, User user, JdbcType jdbcType) throws SQLException {
        preparedStatement.setLong(i,user.getId());
    }

    @Override
    public User getNullableResult(ResultSet resultSet, String s) throws SQLException {
        log.debug("index ="+s+resultSet.getInt(s));
        return xUserDao.selectOne(ImmutableMap.of("id",resultSet.getInt(s)));
    }

    @Override
    public User getNullableResult(ResultSet resultSet, int i) throws SQLException {
        log.debug("index ="+i);
        return xUserDao.selectOne(ImmutableMap.of("id",resultSet.getLong(i)));
    }

    @Override
    public User getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        log.debug("index ="+i);
        return xUserDao.selectOne(ImmutableMap.of("id",callableStatement.getLong(i)));
    }
}
