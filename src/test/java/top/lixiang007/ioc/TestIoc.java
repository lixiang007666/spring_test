package top.lixiang007.ioc;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoc {

    @Test
    public void test(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过容器获取userDao实例
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //3.调用实例中的say()方法
        userDao.say();
    }
}
