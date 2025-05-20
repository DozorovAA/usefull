package ru.digital.league.mail;

import java.util.Properties;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Store;

public class GetMassageFromMail {
    public static final String usernameFrom = "alexalex.01@mail.ru";
    public static final String passwordFrom = "U06h0TfHDmtyq4z391WW";
    public static final String host = "imap.mail.ru";

    //IMAP
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.put("mail.store.protocol", "imaps");

        Store store = Session.getInstance(props).getStore();
        store.connect(host, usernameFrom, passwordFrom);
        Folder inbox = store.getFolder("INBOX");
        inbox.open(Folder.READ_WRITE);
        System.out.println("Количество писем = " + inbox.getMessageCount());

        Message message = inbox.getMessage(inbox.getMessageCount());
        /*Multipart multipart = (Multipart) message.getContent();
        System.out.println(multipart.getContentType());*/

        message.setFlag(Flags.Flag.DELETED, true);
        inbox.close();
    }
}
