package smarthomeautomation.LightBulbs;

import java.util.ArrayList;
import java.util.List;

public class LuminaBasic extends LightBulb {

    public LuminaBasic(List<String> connectivity, List<String> features, String color,int wattage) {
        super("Lumina Basic", connectivity, features, color,wattage);
    }

    @Override
    public SmartLightBulb clone() {
        return new LuminaBasic(new ArrayList<String>(this.getConnectivityList()),new ArrayList<String>(this.getFeaturesList()),this.getColor(),this.wattage);
    }
}
