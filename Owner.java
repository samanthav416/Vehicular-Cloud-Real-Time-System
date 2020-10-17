import java.util.*;

public class Owner {

    public String ownerId;
    public int vpn;
    public String model;
    public String make;
    public String color;
    public String location;
    public String time;
    public int mileage;

    //Setter Methods
    public void setOwnerId(String ownerId) {
        ownerId = ownerId;
    }

    public void setVpn(int v) {
        vpn = v;
    }

    public void setModel(String mo) {
        model = mo;
    }

    public void setMake(String m) {
        make = m;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void setTime(String t) {
        time = t;
    }

    public void setMileage(int m) {
        mileage = m;
    }

    //Getter Methods
    public String getOwnerId() {
        return ownerId;
    }

    public int getVpn() {
        return vpn;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public String getTime() {
        return time;
    }

    public int getMileage() {
        return mileage;
    }

    public void showInfo() {

        System.out.println("Owner ID:" + "\t" + ownerId);
        System.out.println("VPN:" + "\t" + vpn);
        System.out.println("Make:" + "\t" + make);
        System.out.println("Model:" + "\t" + model);
        System.out.println("Mileage:" + "\t" + mileage);
        System.out.println("Color:" + "\t" + color);
        System.out.println("Time:" + "\t" + color);


    }


}
    

	
	

	
   