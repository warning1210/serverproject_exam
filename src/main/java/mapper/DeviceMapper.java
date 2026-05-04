package mapper;

import java.util.List;
import model.Device;

public interface DeviceMapper {
    List<Device> findAll();
    Device findById(int id);
    void save(Device device); // insert or update
}