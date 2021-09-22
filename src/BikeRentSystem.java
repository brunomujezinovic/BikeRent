public class BikeRentSystem {
    public static void main(String[] args){
        Bicycle bmx =new Bicycle();

        bmx.setBrand("BMX");
        bmx.setSpeed(15);
        bmx.setGear(10);
        bmx.gearDown();
        bmx.setColor("Šareni");


        bmx.printState();

        Bicycle limex =new Bicycle();

        limex.setBrand("imex");
        limex.setColor("žuti");
        limex.setSpeed(20);
        limex.setGear(15);
        limex.gearUp();

        limex.printState();
    }
}
