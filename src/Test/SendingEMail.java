package Test;

import Utility.Gmail;

public class SendingEMail {
    public static void main(String[] args) {

        String username = "lenadogan.us@gmail.com";     // your username
        String password = "GulNata07";

        String Subject = "Testing Gmail";               // subject of the email
        String MSG = "Testing \n Hi how are you";       // the message that we want to send

        String receiver = "lenadogan.us@gmail.com";
        Gmail.sendEmails(username, password, receiver, Subject, MSG);

        // or
        String[] Receivers = {"lenadogan.us@gmail.com", "kubilaydogan.us@gmail.com"};
        Gmail.sendEmails(username, password, Receivers[1], Subject, MSG);


        // IF WE WANT TO SENT EMAIL TO MULTIPLE RECEIVERS

        for (String each : Receivers) {
            Gmail.sendEmails(username, password, each, Subject, MSG);
        }

        System.out.println("Completed");

    }
}

