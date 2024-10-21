package smarthomeautomation.DevicesFactory;
import smarthomeautomation.Constants.*;
import smarthomeautomation.SecurityCameras.GuardBasic;
import smarthomeautomation.SecurityCameras.Decorator.GuardElite;
import smarthomeautomation.SecurityCameras.Decorator.GuardPro;
import smarthomeautomation.SecurityCameras.SmartSecurityCamera;
import smarthomeautomation.SmartDevice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SmartSecurityCameras extends SmartDeviceFactory {
    private static HashMap<CameraModel, SmartSecurityCamera> securityCameraHashMap=new HashMap<>();

    static {
        var features=new ArrayList<String>(List.of(new String[]{"Motion Detection","Night Vision"}));
        var connectivity=new ArrayList<String>(List.of(new String[]{"Wi-Fi"}));

        var guardBasic=new GuardBasic(connectivity,features,"720p",90,"Local Storage");
        securityCameraHashMap.put(CameraModel.GUARDBASIC,guardBasic);

        var guardElite=new GuardElite(guardBasic);
        guardElite.addSpecifications(new String[]{"Bluetooth"},new String[]{"Two Way Audio","Person Detection"},"1080p",120,"Cloud Storage");
        securityCameraHashMap.put(CameraModel.GUARDELITE, guardElite);

        var guardPro=new GuardPro(guardElite);
        guardPro.addSpecifications(new String[]{"ZigBee"},new String[]{"Facial Recognitions","Smart Alerts"},"4k",180,"Hybrid");
        securityCameraHashMap.put(CameraModel.GUARDPRO, guardPro);
    }

    @Override
    public SmartDevice getSmartDeviceModel(Model model) {
        return (SmartDevice) securityCameraHashMap.get((CameraModel) model);
    }
}
