package com.spring5.emails;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

public class MimeMessageSendResouce implements OrderManager {


    public void placeOrder(final Order order) {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost("mail.host.com");

        MimeMessage message = sender.createMimeMessage();

        // use the true flag to indicate you need a multipart message
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setTo("test@host.com");

            // use the true flag to indicate the text included is HTML
            helper.setText("<html><body><img src='cid:identifier1234'></body></html>", true);

            // let's include the infamous windows Sample file (this time copied to c:/)
            FileSystemResource res = new FileSystemResource(new File("c:/Sample.jpg"));
            helper.addInline("identifier1234", res);
        } catch (MessagingException e) {
            e.printStackTrace();
        }


        sender.send(message);

    }
}
