package smarthomeautomation.SecurityCameras.Decorator;

import smarthomeautomation.DeviceDecorator;
import smarthomeautomation.SecurityCameras.GuardBasic;
import smarthomeautomation.SecurityCameras.SmartSecurityCamera;

import java.util.ArrayList;

public abstract class CameraDecorator extends DeviceDecorator implements SmartSecurityCamera {
    private final SmartSecurityCamera smartSecurityCamera;
    public CameraDecorator(SmartSecurityCamera smartSecurityCamera,String model) {
        super(smartSecurityCamera.clone());
        this.smartSecurityCamera=(SmartSecurityCamera)this.smartDevice;
        setModel(model);
    }
    public void addSpecifications(String[] connectivity,String[] features,String resolution, int fieldOfView, String storageType){
        addFeature(features);
        addConnectivityType(connectivity);
        setResolution(resolution);
        setFieldOfView(fieldOfView);
        setStorageType(storageType);
    }
    public void setResolution(String resolution) {
        smartSecurityCamera.setResolution(resolution);
    }

    public void setFieldOfView(int fieldOfView) {
        smartSecurityCamera.setFieldOfView(fieldOfView);
    }

    public void setStorageType(String storageType) {
        smartSecurityCamera.setStorageType(storageType);
    }

    public String getResolution() {
        return smartSecurityCamera.getResolution();
    }

    public int getFieldOfView() {
        return smartSecurityCamera.getFieldOfView();
    }

    public String getStorageType() {
        return smartSecurityCamera.getStorageType();
    }
    public SmartSecurityCamera clone(){
        return new GuardBasic(new ArrayList<String>(this.getConnectivityList()),new ArrayList<String>(this.getFeaturesList()),this.getResolution(),this.getFieldOfView(),this.getStorageType());
    }
    @Override
    public String toString() {
        return "SecurityCamera{" +
                "resolution='" + smartSecurityCamera.getResolution() + '\'' +
                ", fieldOfView=" + smartSecurityCamera.getFieldOfView() +" degree" + '\'' +
                ", storageType='" + smartSecurityCamera.getStorageType() + '\'' +
                ", model='" + smartSecurityCamera.getModel() + '\'' +
                ", features=" + smartSecurityCamera.getFeaturesList() +
                ", connectivity=" + smartSecurityCamera.getConnectivityList()+
                '}';
    }
}
