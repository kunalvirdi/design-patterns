package smarthomeautomation.SecurityCameras;

import smarthomeautomation.SmartDevice;

public interface SmartSecurityCamera extends SmartDevice {
    void setResolution(String resolution);

    void setFieldOfView(int fieldOfView);

    void setStorageType(String storageType);

    String getResolution();

    int getFieldOfView();

    String getStorageType();
    SmartSecurityCamera clone();
}
