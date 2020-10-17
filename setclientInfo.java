import java.util.Scanner;

public class setclientInfo {

    public static void setclientInfo() {


        Client c1 = new Client();

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter Client ID: ");
        String cltId = kb.next();
        c1.setClientId(cltId);


        System.out.println("Enter Duration: ");
        double dr = kb.nextDouble();
        c1.setDuration(dr);

        System.out.println("Enter Deadline:");
        String ddl = kb.next();
        c1.setDeadline(ddl);

        c1.showInfo();


    }

}
