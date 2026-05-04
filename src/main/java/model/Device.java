package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Device {
    private int id;
    private String name;
    private String cpu;
    private int ram;
    private int storage;
    private String os;
    private String updatedAt;
}