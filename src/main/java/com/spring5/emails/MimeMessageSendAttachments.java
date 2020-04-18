package com.spring5.emails;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

public class MimeMessageSendAttachments implements OrderManager {

    @Override
    public void placeOrder(Order order) {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost("mail.host.com");

        MimeMessage message = sender.createMimeMessage();

        // use the true flag to indicate you need a multipart message
        MimeMessageHelper helper = null;
        try {
            helper = new MimeMessageHelper(message, true);
            helper.setTo("test@host.com");

            helper.setText("Check out this image!");
            // let's attach the infamous windows Sample file (this time copied to c:/)
            FileSystemResource file = new FileSystemResource(new File("c:/Sample.jpg"));
            helper.addAttachment("CoolImage.jpg", file);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        sender.send(message);
    }
}
