/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.harshits.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 *
 * @author harsh
 */
public class TestSpring {
   public static void main(String[] args){
       String configFile = "src/main/java/spring.xml";
       ApplicationContext ctx = new FileSystemXmlApplicationContext(configFile);
       HelloBean bean = ctx.getBean(HelloBean.class);
       System.out.println(bean.Hello());
   } 
}
