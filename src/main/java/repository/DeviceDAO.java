package repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mapper.DeviceMapper;
import model.Device;

@Repository
public class DeviceDAO {

    @Autowired
    private DeviceMapper mapper;

    public List<Device> findAll(){
        return mapper.findAll();
    }

    public Device findById(int id){
        return mapper.findById(id);
    }

    public void save(Device d){
        mapper.save(d);
    }
}