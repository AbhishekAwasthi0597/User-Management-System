package com.geekster.user.management.system.services;

import com.geekster.user.management.system.dao.UmsRepo;
import com.geekster.user.management.system.model.Ums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UmsService {
    @Autowired
    UmsRepo umsRepo;
    public void userAdd(Ums ums){
      umsRepo.repoAdd(ums);
    }

    public Ums getUmsbyId(Integer id) {
        return  umsRepo.getUserbyId(id);
    }

    public List<Ums> getUserAtService() {
         return umsRepo.getUserAtRepo();
    }

    public Ums updateUser(int id, Ums ums) {
        return umsRepo.updateUser(id,ums);
    }

    public Ums deleteUser(int id) {
        return  umsRepo.deleteUser(id);
    }
}
