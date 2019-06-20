package com.soft.jdbctemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

//演示JDBC模板
public class Demo {

    @Test
    public void test() throws Exception{

        //0准备链接池
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test1");
        System.out.println("success");
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        //1创建JDBC模板对象
        JdbcTemplate jt = new JdbcTemplate();
        jt.setDataSource(dataSource);

        //2书写sql，并执行
        String sql="insert into tb_user values(null,'mm','1167')";
        jt.update(sql);

    }

}
