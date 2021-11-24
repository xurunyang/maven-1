package com.xry.service;

import com.xry.bean.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    public void save(Account account);
    public List<Account> selectacc();
}
