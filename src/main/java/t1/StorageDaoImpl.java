package t1;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): t1
 * Class(类名): StorageDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Repository
public class StorageDaoImpl implements StorageDao
{
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Storage selectByProductId(String productId)
    {
        String sql = "select * from storage where product_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Storage.class), productId);
    }

    @Override
    public int decrease(Storage record)
    {
        String sql = " update storage set  used =? ,residue=? where product_id=?";
        return jdbcTemplate.update(sql, record.getUsed(), record.getResidue(), record.getProductId());
    }
}
