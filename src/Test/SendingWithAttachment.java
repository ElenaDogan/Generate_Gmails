package Test;

import Utility.Gmail;

public class SendingWithAttachment {
    public static void main(String[] args) {

        String username = "lenadogan.us@gmail.com";     // your username
        String password = "GulNata07";
        String receiver = "kubilaydogan.us@gmail.com";
        String subject = "Sending Picture";               // subject of the email
        String message = "Testing \n Hi! How are you";       // the message that we want to send

        String path = "/Users/kubilaydogan/Downloads/Melisa.png";
        String description = "Picture of Melisa";
        String name = "Melisa";

        Gmail.sendEmails(username, password, receiver, subject, message , path, description, name);
    }
}
