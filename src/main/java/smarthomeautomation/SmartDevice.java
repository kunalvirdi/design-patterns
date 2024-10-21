package smarthomeautomation;
import java.util.List;
public interface SmartDevice {
    void addFeature(String[] feature);
    void addConnectivityType(String[] connectivity);
    void setModel(String mode);
    String getModel();
    List<String> getFeaturesList();
    List<String> getConnectivityList();
    String toString();
}
