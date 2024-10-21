package smarthomeautomation.DevicesFactory;

import smarthomeautomation.Constants.*;
import smarthomeautomation.LightBulbs.Decorator.LuminaColor;
import smarthomeautomation.LightBulbs.Decorator.LuminaPro;
import smarthomeautomation.LightBulbs.LuminaBasic;
import smarthomeautomation.LightBulbs.SmartLightBulb;
import smarthomeautomation.SmartDevice;

import java.util.*;

public class SmartLightBulbs extends SmartDeviceFactory {
    private static HashMap<BulbModels, SmartLightBulb> lightMap=new HashMap<>();

    static{
        var features=new ArrayList<String>(List.of(new String[]{"On/Off","Brightnes Control"}));
        var connectivity=new ArrayList<String>(List.of(new String[]{"Wi-Fi"}));

        var luminaBasic=new LuminaBasic(connectivity,features,"Warm White",9);
        lightMap.put(BulbModels.LUMINABASIC, luminaBasic);

        var luminaColor=new LuminaColor(luminaBasic);
        luminaColor.addSpecifications(new String[]{"Color Changing"},new String[]{"Bluetooth"},"RGB + Warm White",10);
        lightMap.put(BulbModels.LUMINACOLOR, luminaColor);
//
        var luminaPro=new LuminaPro(luminaColor);
        luminaPro.addSpecifications(new String[]{"Schedule setting","Voice control"},new String[]{"ZigBee"},"RGB + Warm White to Cool White",12);
        lightMap.put(BulbModels.LUMINAPRO, luminaPro);

    }

    @Override
    public SmartDevice getSmartDeviceModel(Model model){
        return (SmartDevice) lightMap.get((BulbModels) model);
    }
}
