package t1;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): t1
 * Class(类名): Storage
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Storage
{
    //自增 id
    private Long id;
    //商品 id
    private String productId;
    //商品库存总数
    private Integer total;
    //已用商品数量
    private Integer used;
    //剩余商品数量
    private Integer residue;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public Integer getUsed()
    {
        return used;
    }

    public void setUsed(Integer used)
    {
        this.used = used;
    }

    public Integer getResidue()
    {
        return residue;
    }

    public void setResidue(Integer residue)
    {
        this.residue = residue;
    }
}
