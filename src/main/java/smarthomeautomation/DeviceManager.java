package smarthomeautomation;

import smarthomeautomation.DevicesFactory.SmartDeviceFactory;
import smarthomeautomation.Constants.*;
import java.util.*;
public class DeviceManager {
    private final List<SmartDevice> smartDevices;
    private DeviceManager(DeviceBuilder deviceBuilder){
        this.smartDevices=deviceBuilder.smartDevices;
    }

    public List<SmartDevice> getDevices(){
        return this.smartDevices;
    }
    public static class DeviceBuilder{
        private final List<SmartDevice> smartDevices;

        public DeviceBuilder(){
            this.smartDevices=new ArrayList<SmartDevice>();
        }
        public DeviceBuilder addBasic(){

            var luminaBasic= SmartDeviceFactory.getSmartDevice(SmartDevices.LIGHTBULB,BulbModels.LUMINABASIC);
            var guardBasic=SmartDeviceFactory.getSmartDevice(SmartDevices.CAMERA,CameraModel.GUARDBASIC);

            this.smartDevices.add(luminaBasic);
            this.smartDevices.add(guardBasic);
            return this;
        }
        public DeviceBuilder addLighBulb(Model model){
            this.smartDevices.add(SmartDeviceFactory.getSmartDevice(SmartDevices.LIGHTBULB,model));
            return this;
        }
        public DeviceBuilder addCamera(Model model){
            this.smartDevices.add(SmartDeviceFactory.getSmartDevice(SmartDevices.CAMERA,model));
            return this;
        }
        public DeviceManager build(){
            return new DeviceManager(this);
        }
    }
}
