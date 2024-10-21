package smarthomeautomation.LightBulbs;

import smarthomeautomation.Device;

import java.util.*;

public abstract class LightBulb extends Device implements SmartLightBulb {
    protected int wattage;
    protected String color;
    public LightBulb(String model, List<String> connectivity, List<String> features, String color, int wattage) {
        super(model, connectivity, features);
        this.color=color;
        this.wattage=wattage;
    }
    public String getColor(){
        return color;
    }
    public void setWattage(int wattage){this.wattage=wattage;}
    public void setColor(String color){this.color=color;}
    public int getWattage(){
        return wattage;
    }
    public String toString(){
        return "Model "+model+" with color "+color+" wattage: "+wattage+" features "+features+" connectivity type "+connectivity;
    }
    public abstract SmartLightBulb clone();

}
