package t1;

import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): PACKAGE_NAME
 * Class(类名): t1.Order
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 12:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Order
{
    //自增 id
    private Long id;
    //订单 id
    private String orderId;
    //用户 id
    private String userId;
    //商品 id
    private String productId;
    //订单商品数量
    private Integer count;
    //订单金额
    private BigDecimal money;
    //订单状态
    private Integer status;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getOrderId()
    {
        return orderId;
    }

    public void setOrderId(String orderId)
    {
        this.orderId = orderId;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public Integer getCount()
    {
        return count;
    }

    public void setCount(Integer count)
    {
        this.count = count;
    }

    public BigDecimal getMoney()
    {
        return money;
    }

    public void setMoney(BigDecimal money)
    {
        this.money = money;
    }

    public Integer getStatus()
    {
        return status;
    }

    public void setStatus(Integer status)
    {
        this.status = status;
    }
}
