package Utility;

import org.apache.commons.mail.*;

public class Gmail {

    public static void sendEmails(String username, String password, String Receiver, String Subject, String MSG) {
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);
        email.setSubject(Subject);
        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.addTo(Receiver);
            email.send();
            Thread.sleep(1500);
        } catch (Exception e) {
        }
    }

    public static void sendEmails(String username, String password, String Receiver, String Subject, String MSG, String path, String description, String name) {
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(path);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription(description);
        attachment.setName(name);

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication(username, password);
        email.setSSLOnConnect(true);
        email.setSubject(Subject);

        try {
            email.setFrom(username);
            email.setMsg(MSG);
            email.addTo(Receiver);
            email.attach(attachment);
            email.send();
            Thread.sleep(1500);
        } catch (Exception e) {
        }
    }
}
