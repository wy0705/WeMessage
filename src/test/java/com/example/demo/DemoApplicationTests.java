package com.example.demo;

import com.example.demo.controller.DataController;
import com.example.demo.controller.FriendController;
import com.example.demo.controller.MessageController;
import com.example.demo.controller.UserController;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Friends;
import com.example.demo.entity.Message;
import com.example.demo.entity.User;
import com.example.demo.entity.UserData;
import com.example.demo.service.*;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.Entity;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private DataserviceImpl dataservice;

    @Autowired
    private FriendsServiceImpl friendsService;

    @Autowired
    private MessageServiceImpl messageService;

    @Test
    public void test() throws Exception {
        userService.insertUser(new User("jdfsa",1,"jajdhsf"));
        userService.register("asf");
        userService.findUserByNameAndPassword("jdfsa","jajdhsf");
        userService.selectByuid(1);
        //userService.deleteUser(1);

       /* dataservice.insertdata(new UserData("asdf",11,"asfd"));
        dataservice.selectBydid("asdf");
        dataservice.updatedataz(new UserData("asdf",44,"rfvg"));


        friendsService.insertFriend(new Friends("fads","agfds","adfsdgg"));
        friendsService.selectFriendByIUid("agfds");

        messageService.insertMessage(new Message("dfsa","dsaf","asdf",89,"asfd"));
        messageService.selectMessageByfid("dsaf");*/

    }

}
