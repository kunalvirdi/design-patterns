package smarthomeautomation.LightBulbs.Decorator;

import smarthomeautomation.DeviceDecorator;
import smarthomeautomation.LightBulbs.LuminaBasic;
import smarthomeautomation.LightBulbs.SmartLightBulb;

import java.util.ArrayList;

public abstract class BulbDecorator extends DeviceDecorator implements SmartLightBulb {
    private final SmartLightBulb lightBulb;
    public BulbDecorator(SmartLightBulb lightBulb, String model){
        super(lightBulb.clone());
        this.lightBulb=(SmartLightBulb) super.smartDevice;
        setModel(model);
    }
    public void addSpecifications(String[] feature, String[] connectivity,String color,int wattage){
        addConnectivityType(connectivity);
        addFeature(feature);
        setColor(color);
        setWattage(wattage);
    }

    @Override
    public void setColor(String color) {
        lightBulb.setColor(color);
    }

    @Override
    public void setWattage(int wattage) {
        lightBulb.setWattage(wattage);
    }

    @Override
    public String getColor() {
        return lightBulb.getColor();
    }

    @Override
    public int getWattage() {
        return lightBulb.getWattage();
    }

    @Override
    public SmartLightBulb clone() {
        return new LuminaBasic(new ArrayList<String>(this.getConnectivityList()),new ArrayList<String>(this.getFeaturesList()),this.getColor(),this.getWattage());
    }

    public String toString(){
        return "Model "+getModel()+" with color "+getColor()+" wattage: "+getWattage()+" features "+getFeaturesList()+" connectivity type "+getConnectivityList();
    }
}
