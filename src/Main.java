import java.sql.SQLOutput;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean carExist = false;
        Object currentType;
        System.out.println("Select Car engine type, or EXIT : ");
        for (CarEngineType value : CarEngineType.values()) {
            System.out.println(value.toString().concat(" "));
        }
        String carType = scan.nextLine().trim();


        for (CarEngineType value : CarEngineType.values()) {
            if (carType.equalsIgnoreCase(value.name())) {
                System.out.println("Ima");
                carExist = true;
            }
        }

        CarEngineType selectedCarType = CarEngineType.valueOf((carType.trim()));
        Scanner carDetails = new Scanner(System.in);


        Car car=new Car();





        System.out.println("Type in the name of the manufacturer: ");
        String manufacturer = carDetails.nextLine();
        car.setManufacturer(manufacturer);
        carDetails.reset();

        System.out.println("Type in the model name: ");
        String modelName = carDetails.nextLine();
        car.setModelName(modelName);
        carDetails.reset();

        System.out.println("Choose the transmission type:");
        for (Map.Entry<Integer, String> entry : Car.transmissionType.entrySet()) {
            System.out.println(entry.getKey() + "    " + entry.getValue());
        }
        Integer transmissionType = carDetails.nextInt();
        carDetails.reset();

        System.out.println("Type in the date of production: ");
        int dateOfProduction = carDetails.nextInt();
        car.setDateOfProduction(dateOfProduction);
        carDetails.reset();


        System.out.println("Type in the date of registration:");
        String dateOfRegistration = carDetails.next();
        car.setDateOfRegistration(dateOfRegistration);
        carDetails.reset();


        System.out.println("Type in the engine power in HP: ");
        Float enginePower = carDetails.nextFloat();
        car.setEnginePower(enginePower);
        carDetails.reset();

        System.out.println("Type in the top speed");
        Float topSpeed = carDetails.nextFloat();
        car.setTopSpeed(topSpeed);
        carDetails.reset();

        System.out.println("Type in the maximum torque:");
        Float torque = carDetails.nextFloat();
        car.setTorque(torque);
        carDetails.reset();


        String el = "Electric";
        String hy ="Hybrid";
        IntCombCar car2 = new IntCombCar();
        boolean checkTypeElectric=carType.equals(CarEngineType.Electric.name());
        System.out.println(checkTypeElectric);
        boolean checkTypeHybrid=carType.equals(CarEngineType.Hybrid.name());
        if  (checkTypeElectric=false)
            {
                System.out.println("Type in the fuel tank size: ");
                Float FuelTankSize=carDetails.nextFloat();
                car2.setFuelTankSize(FuelTankSize);
                carDetails.reset();


            }
        if (checkTypeHybrid=false)
        {

            car.detailGet();
        }


        ElectricCar carElectricOrHybrid=new ElectricCar();
        switch (carType)
        {
            case "Electric":
                System.out.println("Type in the maximum range: ");
                Float range=carDetails.nextFloat();
            carElectricOrHybrid.setRange(range);
            carDetails.reset();

                System.out.println("Type in the battery size:");
            Float batterySize=carDetails.nextFloat();
            carElectricOrHybrid.setBatterySize(batterySize);
            carDetails.reset();
                car2.detailGet();

            case "Hybrid":
                System.out.println("Type in the battery size: ");
                Float batterySizeForHybrid=carDetails.nextFloat();
                carElectricOrHybrid.setBatterySize(batterySizeForHybrid);
                carDetails.reset();
                car2.detailGetHybrid();



        }



//
//        if (carType.equals("Electric")||(carType.equals("Hybrid")))
//        {
//            System.out.println("Type in the battery size: ");
//            Float batterySize = carDetails.nextFloat();
//            carDetails.reset();
//
//        }
//        if (carType.equals("Hybrid"))
//        {
//            System.out.println("Type in the fuel tank size :");
//            Float fuelTank = carDetails.nextFloat();
//            carDetails.reset();
//
//        }






//        if (carType.equals(CarEngineType.Electric))
//        {
//            System.out.println("Enter battery size:");
//        }
    }


}
