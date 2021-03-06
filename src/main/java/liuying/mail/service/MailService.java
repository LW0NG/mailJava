package liuying.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
  @Value("${spring.mail.username}")
  private String from;
  @Autowired
  private JavaMailSender mailSender;

  public void sayHello () {
    System.out.println("hello world liuying");
  }
  
  public void sendSimpleMail(String to, String subject, String content) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setTo(to);
    message.setSubject(subject);
    message.setText(content);
    message.setFrom(from);
    mailSender.send(message);
    
  }
}