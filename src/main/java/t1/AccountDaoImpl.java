package t1;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Project name(项目名称)：Spring基于注解实现事务管理
 * Package(包名): t1
 * Class(类名): AccountDaoImpl
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/5
 * Time(创建时间)： 13:08
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Repository
public class AccountDaoImpl implements AccountDao
{
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByUserId(String userId)
    {
        String sql = "  select * from account where user_id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), userId);
    }

    @Override
    public int decrease(String userId, BigDecimal money)
    {
        String sql = "UPDATE account SET residue = residue - ?, used = used + ? WHERE user_id = ?;";
        return jdbcTemplate.update(sql, money, money, userId);
    }
}
