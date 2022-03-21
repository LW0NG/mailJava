package liuying.mail.service;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
// @RunWith(SpringRunner.class)
@SpringBootTest

public class MailTest {
  @Resource
  MailService mailService;

  // @Test
  // public void sayHello() {
  //   mailService.sayHello();
  // }
  
  @Test
  public void sendSimpleMailTest() {
    mailService.sendSimpleMail("liuying202203@126.com", "我的测试邮件","wobingle");
  }

}
