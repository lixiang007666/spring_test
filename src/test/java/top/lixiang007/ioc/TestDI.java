package top.lixiang007.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {
    @Test
    public void test(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.say();
    }
}
