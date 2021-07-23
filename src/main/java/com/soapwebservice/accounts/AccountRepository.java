package com.soapwebservice.accounts;

import com.sensedia.xml.bank.Account;
import com.sensedia.xml.bank.LISTTYPE;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class AccountRepository{

    private static final Map<Integer, Account> accounts = new HashMap<>();

    @PostConstruct
    public void initData(){

        Account account = new Account();
        account.setId(1);
        account.setAgency(1234);
        account.setNumber(12345678);
        account.setDigit(9);
        account.setDocumentNumber("46022509041");
        account.setInstitution("Banco Original");
        account.setType("Conta corrente");
        account.setOwnership("Astolfo Ferreira Cruz");
        accounts.put(account.getId(), account);

        account = new Account();
        account.setId(2);
        account.setAgency(4321);
        account.setNumber(98765432);
        account.setDigit(1);
        account.setDocumentNumber("12345678901");
        account.setInstitution("BMG");
        account.setType("Conta corrente");
        account.setOwnership("Afonso Claudio Pinheiro");
        accounts.put(account.getId(), account);
    }

    public Account findAccount(int id){
        Assert.notNull(id, "The Account's id must not be null");
        return accounts.get(id);
    }

    public LISTTYPE findAllAccounts(){
        LISTTYPE ret = new LISTTYPE();
        ret.getAccounts().addAll(accounts.values());
        return ret;
    }
}
