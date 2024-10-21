package smarthomeautomation.SecurityCameras;

import java.util.ArrayList;
import java.util.List;

public class GuardBasic extends SecurityCamera {
    public GuardBasic(List<String> connectivity, List<String> features, String resolution, int fieldOfView, String storageType) {
        super("Guard Basic", connectivity, features, resolution, fieldOfView, storageType);
    }
    public SmartSecurityCamera clone(){
        return new GuardBasic(new ArrayList<String>(this.getConnectivityList()),new ArrayList<String>(this.getFeaturesList()),this.getResolution(),this.getFieldOfView(),this.getStorageType());
    }
}
