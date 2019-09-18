package cn.wellcare.user.controller;

import cn.wellcare.user.service.UserService;
import cn.wellcare.model.Order;
import cn.wellcare.model.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getUserOrders/{id}")
    public ServiceResult<List<Order>> getUserOrders(@PathVariable("id") String id){

        return userService.getUserOrders(id);
    }
}
