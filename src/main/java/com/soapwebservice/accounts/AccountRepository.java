package com.soapwebservice.accounts;

import com.sensedia.xml.account.Account;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class AccountRepository {

    private static final Map<Integer, Account> accounts = new HashMap<>();

    @PostConstruct
    public void initData() {

        Account account = new Account();
        account.setIdentificacao(1);
        account.setAgencia(1234);
        account.setNumero(12345678);
        account.setDigito(9);
        account.setCpfcnpj("46022509041");
        account.setInstituicao("Banco do Brasil");
        account.setTipo("Conta corrente");
        account.setTitularidade("Astolfo Ferreira Cruz");
        accounts.put(account.getIdentificacao(), account);

        account = new Account();
        account.setIdentificacao(2);
        account.setAgencia(4321);
        account.setNumero(98765432);
        account.setDigito(1);
        account.setCpfcnpj("12345678901");
        account.setInstituicao("Bradesco");
        account.setTipo("Conta corrente");
        account.setTitularidade("Afonso Claudio Pinheiro");
        accounts.put(account.getIdentificacao(), account);
    }

    public Account findAccount(int identificacao) {
        Assert.notNull(identificacao, "The Account's identification must not be null");
        return accounts.get(identificacao);
    }

}
