package scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import model.Device;
import service.DeviceService;

@Component
public class DeviceScheduler {

    @Autowired
    private DeviceService service;

    @Scheduled(cron = "0 */1 * * * ?") //1분마다
    public void sync(){

        RestTemplate rt = new RestTemplate();

        Device[] list = rt.getForObject(
            "http://localhost:5500/data.json",
            Device[].class
        );

        for(Device d : list){
            service.save(d);
        }
    }
}