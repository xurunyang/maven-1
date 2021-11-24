package com.xry.service.impl;

import com.xry.bean.Account;
import com.xry.mapper.AccountMapper;
import com.xry.service.AccountService;
import com.xry.utils.JdbcUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.io.IOException;
import java.util.List;
@Service("accountService")//该注解和@controller @Component、@Repository作用一样 都是通过注解让spring帮我们创建对象
/*accountService注解说明：我们让spring帮我们创建对象 会和我们自己new 对象一样 需要一个对象名
        我们通过注解后面声明该对象名 而如果我们自己不设置 它默认为该对象的类名(首字母必是小写)
        所以自动装配的接口对象名就是我们service的实现类的对象名*/
public class AccountServiceimpl implements AccountService {
@Autowired//由于我们在applicationContext.xml配置了让spring帮我们管理mapper
// 我们直接通过自动装配使用mapper接口调用需要的方法即可
private AccountMapper accountMapper;
    public void save(Account account) {
      accountMapper.save(account);
    }

    public List<Account> selectacc() {
        List<Account> selectacc = accountMapper.selectacc();
        return selectacc;

    }
}
