package smarthomeautomation.DevicesFactory;
import smarthomeautomation.Constants;
import smarthomeautomation.SmartDevice;



public abstract class SmartDeviceFactory {
    public abstract SmartDevice getSmartDeviceModel(Constants.Model model);

    public static SmartDevice getSmartDevice(Constants.SmartDevices type, Constants.Model model){
        SmartDevice smartDevice;
        switch (type){
            case Constants.SmartDevices.LIGHTBULB ->{smartDevice = new SmartLightBulbs().getSmartDeviceModel(model);}
            case Constants.SmartDevices.CAMERA ->{smartDevice =new SmartSecurityCameras().getSmartDeviceModel(model);}
            default -> {smartDevice=null;}
        }
        return smartDevice;
    }
}
