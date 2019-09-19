/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otomasyonktp;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author YAGMUR
 */
public class MailAt {

    public static void mailAt(String mailAdres, String konu, String mesaj) {
        final String username = "kutuphane807@gmail.com";
        final String password = "ktP*124*";
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("kutuphane807@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(mailAdres));
            message.setSubject(konu);
            message.setText(mesaj);
            Transport.send(message);

        } catch (MessagingException ex) {
            throw new RuntimeException(ex);
        }
    }
}
