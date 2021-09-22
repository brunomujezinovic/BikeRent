
public class Bicycle {
    private String brand;
    private String color;
    private int maxGear; //max broj brzina
    private int speed;
    private int gear; //trenutna brzina na mjenjacu

    void setSpeed (int value) {
        speed = value;
    }

    void gearUp () {

        gear++;

    }

    void gearDown () {
        gear--;

    }

    void setBrand (String mark) {
        brand = mark;

    }

    void setGear (int value) {
        gear = value;
    }

    void setColor(String boja){
        color = boja;


    }

    public void printState() {
        System.out.println( brand +" "+ color +" "+ maxGear +" "+ speed +" "+ gear);

    }

}
