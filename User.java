
import java.util.*;
import java.io.*;

public class User {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Press 1 if you are a Client.");
        System.out.println("Press 2 if you are an Owner.");
        System.out.println("Enter Here:");

        int input = kb.nextInt();

        if (input == 1) { //Client

            System.out.println("Press 1 to create a job.");
            System.out.println("Press 2 to view current listings.");
            System.out.println("Enter Here:");

            int input3 = kb.nextInt();

            if (input3 == 1) {

                setclientInfo ci = new setclientInfo();
                System.out.println("\n");
                ci.setclientInfo();
                System.out.println("\n");

            }

            if (input3 == 2) {
                System.out.println("Here are the current listings available");
                try {
                    File file = new File("clientRecord.txt");
                    Scanner record = new Scanner(file);
                    while (record.hasNextLine()) {
                        String data = record.nextLine();
                        System.out.println(data);
                    }
                    record.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

        }

        if (input == 2) {   //Owner

            System.out.println("Press 1 to make a new listing.");
            System.out.println("Press 2 to view your current listings.");
            System.out.println("Enter Here:");
            int input2 = kb.nextInt();

            if (input2 == 1) {

                setownerInfo o1 = new setownerInfo();
                System.out.println("\n");
                o1.setownerInfo();
                System.out.println("\n");

            }
            if (input2 == 2) {
                System.out.println("Here are your current listings:");
                try {
                    File file = new File("userRecord.txt");
                    Scanner record = new Scanner(file);
                    while (record.hasNextLine()) {
                        String data = record.nextLine();
                        System.out.println(data);
                    }
                    record.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

        }
    }
}

