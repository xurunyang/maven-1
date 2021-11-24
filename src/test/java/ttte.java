import com.xry.bean.Account;
import com.xry.mapper.AccountMapper;
import com.xry.service.AccountService;
import com.xry.service.impl.AccountServiceimpl;
import com.xry.utils.JdbcUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ttte {
    @Autowired
    private AccountService accountService;
    @Test
    public void yeete(){
        List<Account> selectacc = accountService.selectacc();
        System.out.println(selectacc);

    }
    @Test
    public void uueu(){
        System.out.println("我是pull下来的");
        
    }
}
