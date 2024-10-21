package smarthomeautomation;

public class Constants{
    public interface Model{

    }
    public enum SmartDevices{
        LIGHTBULB, CAMERA
    }
    public enum BulbModels implements Model{
        LUMINABASIC, LUMINACOLOR, LUMINAPRO;
    }
    public enum CameraModel implements Model{
        GUARDBASIC, GUARDELITE, GUARDPRO
    }
}