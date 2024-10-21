package smarthomeautomation.LightBulbs;

import smarthomeautomation.SmartDevice;

public interface SmartLightBulb extends SmartDevice {

    void setColor(String color);

    void setWattage(int wattage);
    String getColor();
    int getWattage();
    SmartLightBulb clone();
}
