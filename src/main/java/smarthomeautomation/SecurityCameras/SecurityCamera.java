package smarthomeautomation.SecurityCameras;

import smarthomeautomation.Device;

import java.util.List;

public abstract class SecurityCamera extends Device implements SmartSecurityCamera {
    protected String resolution;
    protected int fieldOfView;
    protected String storageType;
    public SecurityCamera(String model, List<String> connectivity, List<String> features, String resolution, int fieldOfView, String storageType) {
        super(model, connectivity, features);
        this.resolution=resolution;
        this.fieldOfView=fieldOfView;
        this.storageType=storageType;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setFieldOfView(int fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getResolution() {
        return resolution;
    }

    public int getFieldOfView() {
        return fieldOfView;
    }

    public String getStorageType() {
        return storageType;
    }

    @Override
    public String toString() {
        return "SecurityCamera{" +
                "resolution='" + resolution + '\'' +
                ", fieldOfView=" + fieldOfView +" degree" + '\'' +
                ", storageType='" + storageType + '\'' +
                ", model='" + model + '\'' +
                ", features=" + features +
                ", connectivity=" + connectivity +
                '}';
    }
    public abstract SmartSecurityCamera clone();
}
