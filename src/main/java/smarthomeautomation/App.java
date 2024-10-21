package smarthomeautomation;
import java.util.*;
public class App {
    public static void main(String[] args) {
        var deviceManager=new DeviceManager.DeviceBuilder().addBasic().addCamera(Constants.CameraModel.GUARDELITE).addLighBulb(Constants.BulbModels.LUMINACOLOR).build();

        var smartDevices=deviceManager.getDevices();
        smartDevices.forEach(smartDevice -> System.out.println(smartDevice.toString()));
    }
}
