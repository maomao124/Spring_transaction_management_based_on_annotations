package t1;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): t1
 * Class(类名): OrderDao
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface OrderDao
{
    /**
     * 创建订单
     *
     * @param order Order
     * @return int
     */
    int createOrder(Order order);

    /**
     * 修改订单状态
     * 将订单状态从未完成（0）修改为已完成（1）
     *
     * @param orderId Order
     * @param status  status
     */
    void updateOrderStatus(String orderId, Integer status);
}
