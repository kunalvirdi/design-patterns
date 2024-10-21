package smarthomeautomation;
import java.util.*;

public abstract class Device implements SmartDevice {
    protected String model;
    protected List<String> features;
    protected List<String> connectivity;

    public Device(String model, List<String> connectivity, List<String> features){
        this.model=model;
        this.features=features;
        this.connectivity=connectivity;
    }


    public String getModel(){
        return this.model;
    }
    // In future if needs to add feature and connectivity type to any device!
    public void addFeature(String... feature){
        features.addAll(List.of(feature));
    }
    public void addConnectivityType(String... connectivityType){
        connectivity.addAll(List.of(connectivityType));
    }

    public void setModel(String model){
        this.model=model;
    }

    public List<String> getConnectivityList(){
        return connectivity;
    }
    public List<String> getFeaturesList(){
        return features;
    }
}