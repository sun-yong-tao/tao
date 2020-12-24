package com.taotao.test;

import com.taotao.User;

import com.taotao.UsersMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class managerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public  void selecTest() {
        User user1 = usersMapper.selectById(1);
        System.out.println("----------");
        System.out.println(user1);
        System.out.println("----------");
    }
}
