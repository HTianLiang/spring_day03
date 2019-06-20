package com.soft.jdbctemplate;

import com.soft.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath*:com/soft/jdbctemplate/applicationContext.xml")
public class DemoTest {

    //@Resource(name = "userDao")
    //private UserDao dao;

    private User u;

    @Test
    public void test1(){
        ApplicationContext acx = new ClassPathXmlApplicationContext("*com/soft/jdbctemplate/applicationContext.xml");
        UserDao dao = (UserDao) acx.getBean("userDao");
        u = new User();
        u.setId(14);
        u.setName("李四");
        u.setPass("123");
        dao.update(u);
        System.out.println("success");
    }
    @Test
    public void test2(){
       /* System.out.println(dao);
        System.out.println(dao.getById(1));*/
    }

}
