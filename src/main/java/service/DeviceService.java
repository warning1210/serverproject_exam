package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Device;
import repository.DeviceDAO;

@Service
public class DeviceService {

    @Autowired
    private repository.DeviceDAO dao;

    public List<Device> getAll(){
        return dao.findAll();
    }

    public Device getOne(int id){
        return dao.findById(id);
    }

    public void save(Device d){
        dao.save(d);
    }
}