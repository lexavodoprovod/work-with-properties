package com.exampel.work_with_properties.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


//@ConfigurationProperties(prefix = "app.dealership")
//@Component
public class DealerShipProperties {

    private String name;

    private List<String> cars;

    private Map<String, WorkersInfo> workers;

    @NestedConfigurationProperty
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public Map<String, WorkersInfo> getWorkers() {
        return workers;
    }

    public void setWorkers(Map<String, WorkersInfo> workers) {
        this.workers = workers;
    }
}
