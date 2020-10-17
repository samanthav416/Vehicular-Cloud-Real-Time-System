import java.util.Scanner;
import java.io.*;

public class setownerInfo {


    public static void setownerInfo() {


        Owner l1 = new Owner();

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter Owner ID: ");
        String ownId = kb.next();
        l1.setOwnerId(ownId);

        System.out.println("Enter Vehicle Details ");


        System.out.println("Enter VPN: ");
        int vpn = kb.nextInt();
        l1.setVpn(vpn);

        System.out.println("Enter Make: ");
        String make = kb.next();
        l1.setMake(make);

        System.out.println("Enter Model: ");
        String model = kb.next();
        l1.setModel(model);

        System.out.println("Enter Mileage: ");
        int mileage = kb.nextInt();
        l1.setMileage(mileage);


        System.out.println("Enter Color: ");
        String color = kb.next();
        l1.setColor(color);

        System.out.println("Enter Time: ");
        String time = kb.next();
        l1.setTime(color);

        l1.showInfo();
       
            
        
    }


}

