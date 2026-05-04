package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.Device;
import service.DeviceService;

@RestController
@RequestMapping("/api")
public class DeviceController {

    @Autowired
    private DeviceService service;

    @GetMapping("/devices")
    public List<Device> list(){
        return service.getAll();
    }

    @GetMapping("/devices/{id}")
    public Device detail(@PathVariable int id){
        return service.getOne(id);
    }
}