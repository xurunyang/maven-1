package com.xry.mapper;

import com.xry.bean.Account;

import java.util.List;

public interface AccountMapper {
    public void save(Account account);
    public List<Account> selectacc();
}
