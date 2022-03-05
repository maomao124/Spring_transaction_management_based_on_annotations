package t1;

import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): t1
 * Class(类名): Account
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:00
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Account
{
    //自增 id
    private Long id;
    //用户 id
    private String userId;
    //账户总金额
    private BigDecimal total;
    //已用账户金额
    private BigDecimal used;
    //剩余账户金额
    private BigDecimal residue;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public BigDecimal getTotal()
    {
        return total;
    }

    public void setTotal(BigDecimal total)
    {
        this.total = total;
    }

    public BigDecimal getUsed()
    {
        return used;
    }

    public void setUsed(BigDecimal used)
    {
        this.used = used;
    }

    public BigDecimal getResidue()
    {
        return residue;
    }

    public void setResidue(BigDecimal residue)
    {
        this.residue = residue;
    }
}
