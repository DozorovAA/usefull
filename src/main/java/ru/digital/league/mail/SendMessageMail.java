package ru.digital.league.mail;

import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMessageMail {
    public static final String usernameFrom = "dozorov01@mail.ru";
    public static final String passwordFrom = "iRfnAqiuNjCt2Ey4k47p";//внешний пароль, создается в самой почти в настройках
    public static final String host = "smtp.mail.ru";
    public static final Integer port = 465;

    public static final String usernameTo = "alexalex.01@mail.ru";

    //SMTP Send messages to
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.port", port);
        props.put("mail.smtp.auth", "true");
        Session session = Session.getInstance(props, getAuthenticator(usernameFrom, passwordFrom));

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(usernameFrom));

        InternetAddress[] addressesTo = {new InternetAddress(usernameTo)};
        message.setRecipients(Message.RecipientType.TO, addressesTo);
        message.setSubject("Test message From java");
        message.setSentDate(new Date());
        message.setText("Тестовое сообщения для проверки работы на java");

        Transport.send(message);
    }

    private static Authenticator getAuthenticator(String from, String password) {
        return new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        };
    }
}
