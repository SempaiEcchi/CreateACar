import java.util.HashMap;
import java.util.Map;

public class Car  {

    public String manufacturer;
    public String modelName;
    private int dateOfProduction;
    private String dateOfRegistration;
    private float enginePower;
    private float topSpeed;
    private float torque;
    private CarEngineType type;






    private static int carsCreated;
    public final static Map<Integer, String> transmissionType = new HashMap<>();
    static {
        transmissionType.put(1, "Automatic");
        transmissionType.put(2, "Manual");
        transmissionType.put(3, "CVT");
        transmissionType.put(4, "Dual-Clutch");

    }




    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public float getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(float enginePower) {
        this.enginePower = enginePower;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        this.topSpeed = topSpeed;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public CarEngineType getType() {
        return type;
    }

    public void setType(CarEngineType type) {
        this.type = type;
    }


public void detailGet()
{
    System.out.println("proizveo me"+manufacturer);
}





}
