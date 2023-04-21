package com.geekster.user.management.system.contoller;

import com.geekster.user.management.system.model.Ums;
import com.geekster.user.management.system.services.UmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsmContoller {
    @Autowired
    UmsService umsService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody Ums ums){
        umsService.userAdd(ums);
        return "user has been added";
    }
    @GetMapping("/getUser/{id}")
    public Ums getUserByid(@PathVariable Integer id){
        return umsService.getUmsbyId(id);
    }
    @GetMapping("/getAllUser")
    public List<Ums> getAllUser(){
         return umsService.getUserAtService();
    }
    @PutMapping("/update-user/{id}")
    public  Ums updateUser(@PathVariable int id,@RequestBody Ums ums){
        return  umsService.updateUser(id,ums);
    }
    @DeleteMapping("/delete-user")
    public  String deleteUser(@RequestParam int id){
        Ums ums=umsService.deleteUser(id);
        return "user deleted with Id "+id+"with data"+ums.toString();
    }

}
