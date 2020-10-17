import java.util.*;

public class Client {
    public String clientId;
    public double duration;
    public String deadline;


    //Set Client ID
    public void setClientId(String id) {
        id = clientId;
    }

    //Get Client ID
    public String getClientId() {
        return clientId;
    }

    //Set Duration
    public void setDuration(double d) {
        d = duration;
    }

    //Get Duration
    public double getDuration() {
        return duration;
    }

    //Set Deadline
    public void setDeadline(String dl) {
        dl = deadline;
    }

    //Set Deadline
    public String getDeadline() {
        return deadline;
    }

    public void showInfo() {

        System.out.println("Client ID:" + "\t" + clientId);
        System.out.println("Duration:" + "\t" + duration);
        System.out.println("Deadline:" + "\t" + deadline);


    }

}


