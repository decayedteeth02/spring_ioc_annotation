package cn.Ioc.Test;

import cn.loc.beans.User;
import cn.loc.controller.UserController;
import cn.loc.dao.UserDao;
import cn.loc.service.RoleService;
import cn.loc.service.UserService;
import cn.loc.service.imlp.RoleServicelmpl;
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
    public void test06(){
        UserService bean=ioc.getBean(UserService.class);
        System.out.println(bean.getClass());

        RoleServicelmpl roleServicelmpl=new RoleServicelmpl();

//        判断前面的对象是否为后面对象的类，或者子类，或者接口
        if (roleServicelmpl instanceof RoleService){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }

}
