package com.xry.controller;

import com.xry.bean.Account;
import com.xry.mapper.AccountMapper;
import com.xry.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@Controller
public class AccountController {
    @Autowired
    /*自动装配的说明 我们是用自动装配注解让spring帮我们创建接口的实现类
    * 而我们在接口的实现类用了@Service("accountService")注解
    * 该注解就是让spring帮我们管理该对象 而注解后面括号则是该对象的对象名
    * 我们用该对象名作为自动装配接口的接口名 即可实现让spring帮我们创建接口的实现类*/
    private AccountService accountService;
    @RequestMapping("/save")
    @ResponseBody
    public String save(Account account){
   accountService.save(account);
        return "保存成功";
    }
    @RequestMapping("/selectwhole")
    public ModelAndView selectwhole(){
        ModelAndView modelAndView = new ModelAndView();
        List<Account> selectacc = accountService.selectacc();
        modelAndView.addObject("list",selectacc);
        modelAndView.setViewName("accountlist");
        return modelAndView;
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/gosave")
    public String gosave(){
        return "save";
    }
}
