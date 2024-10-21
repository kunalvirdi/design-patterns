package smarthomeautomation;


import java.util.List;

public abstract class DeviceDecorator implements SmartDevice {
    protected SmartDevice smartDevice;
    public DeviceDecorator(SmartDevice smartDevice){
        this.smartDevice=smartDevice;
    }

    @Override
    public void addFeature(String[] feature) {
        smartDevice.addFeature(feature);
    }

    @Override
    public void addConnectivityType(String[] connectivity) {
        smartDevice.addConnectivityType(connectivity);
    }

    @Override
    public void setModel(String model) {
        smartDevice.setModel(model);
    }

    @Override
    public String getModel() {
        return smartDevice.getModel();
    }

    public List<String> getFeaturesList() {
        return smartDevice.getFeaturesList();
    }

    @Override
    public List<String> getConnectivityList() {
        return smartDevice.getConnectivityList();
    }

}
