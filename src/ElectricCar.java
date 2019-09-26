import java.util.Scanner;

public class ElectricCar extends Car {



public Float batterySize;
public Float range;
//CarEngineType type=CarEngineType.Electric;


//    public ElectricCar(String manufacturer, String modelName, int dateOfProduction, String dateOfRegistration, float enginePower, Integer transmissionType, float topSpeed, float torque, CarEngineType type, Float batterySize, Float range) {
//        super(manufacturer, modelName, dateOfProduction, dateOfRegistration, enginePower, transmissionType, topSpeed, torque, type);
//        this.batterySize = batterySize;
//        this.range = range;
//    }


    public Float getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(Float batterySize) {
        this.batterySize = batterySize;
    }

    public Float getRange() {
        return range;
    }

    public void setRange(Float range) {
        this.range = range;
    }
}
