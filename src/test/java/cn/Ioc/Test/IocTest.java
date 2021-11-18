package cn.Ioc.Test;

import cn.loc.beans.User;
import cn.loc.controller.UserController;
import cn.loc.dao.UserDao;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    ClassPathXmlApplicationContext ioc;
    @Before
    public void before()
    {
        ioc=new ClassPathXmlApplicationContext("spring_ioc.xml");
    }

    @Test
    public void test01(){
        UserDao bean=ioc.getBean(UserDao.class);
        System.out.println(bean);
    }

    @Test
    public void test02(){
        User bean=ioc.getBean(User.class);
         System.out.println(bean.getName());
    }

    @Test
    public void test03(){
        UserController bean=ioc.getBean(UserController.class);
        bean.getUser();
    }

    @Test
    public void test04(){

    }

}
