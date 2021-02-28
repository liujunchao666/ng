package com.example.demo;

import com.example.demo.es.dao.BookRepository;
import com.example.demo.es.type.BookType;
import com.example.demo.xml.AppFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.lang.management.ManagementFactory;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RestController
public class HelloAction  {
    public HelloAction() {
        System.out.println("HelloAction init.....");
    }

    //   @Autowired
//    private DiscoveryClient discoveryClient;
/*    @Autowired
    AppFile appFile;*/

 /*   @Autowired
    private BookRepository bookRepository;*/

    @RequestMapping("/save")
    public void contextLoads() {
        BookType s=new BookType();
        s.setId("1");
        s.setName("天龙八部");
        s.setAge(10);

     //   bookRepository.save(s);
        return;
    }


    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
      //  System.out.println(appFile.getDebug());
   //    return discoveryClient.getServices();
       // return  appFile.getDebug();
        //return  debug;
        return null;
    }


/*    @HystrixCommand(commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000") //默认超时时间1秒 1秒不返回认为异常
    },fallbackMethod ="hystrix_hello" )//去找备选响应，进行服务降级*/
    @RequestMapping("hello/say.do")
   @ResponseBody
    public String hello()  {
        String env = System.getProperty("env");
        return "hello1 env"+env;
    }

    //备选响应，服务降级
    public String hystrix_hello(){
        System.out.println("hystrix_hello");
        return "hystrix_hello";
    }

    @RequestMapping("wei/wei.do")
    @ResponseBody
    public String wei(){
        System.out.println("wei1");
        return "wei1";
    }
    @RequestMapping("info")
    @ResponseBody
    public String info(HttpServletRequest request){
    //    System.out.println("info" +request.getRemoteHost()+" "+request.getRemotePort());
        return "info";
    }

    public static void main(String[] args) {

    //    System.out.println(convertCoinNum2(0.08d));
      /*  List<Integer> li1=new ArrayList<Integer>();
        li1.add(4);
        li1.add(2);
        li1.add(3);
        List<Integer> li2=new ArrayList<Integer>();

        li2.add(2);
        li2.add(4);
        li2.add(3);

        for(Integer l:li1){
            for(Integer l2:li2){
                if(l.equals(l2)){
                    System.out.println(l +" --"+l2);
                    break;
                }
            }
        }*/

        /**
         *     使用-获得>=0=获得？使用
         返还-获得>=0=获得?返还
         获得-（使用-返还）
         * @param userActResults
         */

    /*    Integer UseAmount=5;
        Integer CoinAmount=8;
        Integer ReturnAmount=4;
        Integer useAmount=UseAmount-CoinAmount>=0?CoinAmount:UseAmount;
        Integer returnAmount=ReturnAmount-CoinAmount>=0?CoinAmount:ReturnAmount;
        Integer r= useAmount-returnAmount;
        System.out.println(r);*/

       /* List<UserActivityResult> userActResults=new ArrayList<UserActivityResult>();
        UserActivityResult a=new UserActivityResult();
        a.setSubAmount(1);
        UserActivityResult b=new UserActivityResult();
        b.setSubAmount(4);
        userActResults.add(a);
        userActResults.add(b);
        Integer coinSubAmout= userActResults.stream().mapToInt(UserActivityResult::getSubAmount).sum();
        System.out.println(coinSubAmout);
*/

   /*     String sourceSysNo = String.format("%s_%s",  "111", 44);
        System.out.println(sourceSysNo);
*/


       /*    for(int i=0;i<8;i++){
               if(i==4){
                   System.out.println("44");
                   return;
               }
           }

           System.out.println("88");*/
     /*   List<String> recordUsers = Arrays.asList("7440514,154234".split(","));

        Long userId=Long.parseLong(recordUsers.get(0));
        System.out.println(userId);*/

    }


}
