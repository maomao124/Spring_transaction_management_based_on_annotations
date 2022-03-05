package t1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): t1
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:30
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        Order order = new Order();
        //设置商品 id
        order.setProductId("1");
        //商品数量
        order.setCount(30);
        //商品金额
        order.setMoney(new BigDecimal(600));
        //设置用户 id
        order.setUserId("1");
        //订单状态为未完成
        order.setStatus(0);
        orderService.createOrder(order);
    }
}
