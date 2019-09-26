public class IntCombCar extends Car {


    public Float FuelTankSize;


    private int batterySize;

//    public IntCombCar(String manufacturer, String modelName, int dateOfProduction, String dateOfRegistration, float enginePower, Integer transmissionType, float topSpeed, float torque, CarEngineType type, Float fuelTankSize) {
//        super(manufacturer, modelName, dateOfProduction, dateOfRegistration, enginePower, transmissionType, topSpeed, torque, type);
//        FuelTankSize = fuelTankSize;
//    }

    public Float getFuelTankSize() {
        return FuelTankSize;
    }

    public void setFuelTankSize(Float fuelTankSize) {
        FuelTankSize = fuelTankSize;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public void detailGetHybrid()
    {
        System.out.println("baterija mi je"+batterySize);
    }
}
