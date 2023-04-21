package com.geekster.user.management.system.dao;

import com.geekster.user.management.system.model.Ums;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class UmsRepo {
    List<Ums> list=new ArrayList<>();
    public void repoAdd(Ums ums) {
        list.add(ums);
    }

    public Ums getUserbyId(Integer id) {
        for(Ums u:list){
            if(u.getUserId()==id){
                return u;
            }
        }
        return null;
    }

    public List<Ums> getUserAtRepo() {
       return list;
    }

    public Ums updateUser(int id, Ums ums) {
        if(getUserbyId(id)!=null){
            Ums usm=getUserbyId(id);
            ums.setUserName(ums.getUserName());
            ums.setName(ums.getName());
            ums.setAddress(ums.getAddress());
            ums.setNumber(ums.getNumber());
             return ums;
        }
        return null;
    }

    public Ums deleteUser(int id) {
        Ums ums=getUserbyId(id);
        boolean remove=list.remove(ums);
        if(remove){
            return ums;
        }else{
            return null;
        }
    }
}
