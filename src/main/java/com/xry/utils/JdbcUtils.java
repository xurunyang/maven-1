package com.xry.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class JdbcUtils {
    public static SqlSessionFactory getSqlSessionFactory() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory =
            new SqlSessionFactoryBuilder().build(inputStream);
    return sqlSessionFactory;}
    public static String sql(){
        return "测试git提交切换版本,当我们提交本地库之后代码名会变成黑色 当我们改动代码时" +
                "代码名会变成蓝色表示有改动但未提交";
    }
}
