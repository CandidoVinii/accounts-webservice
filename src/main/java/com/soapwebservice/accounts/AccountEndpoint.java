package com.soapwebservice.accounts;

import com.sensedia.xml.bank.GetAccountRequest;
import com.sensedia.xml.bank.GetAccountResponse;
import com.sensedia.xml.bank.GetAllAccountsRequest;
import com.sensedia.xml.bank.GetAllAccountsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AccountEndpoint {

    private static final String NAMESPACE_URI = "http://www.sensedia.com/xml/bank";

    private AccountRepository accountRepository;

    @Autowired
    public AccountEndpoint(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAccountRequest")
    @ResponsePayload
    public GetAccountResponse getAccount(@RequestPayload GetAccountRequest request){
        GetAccountResponse response = new GetAccountResponse();
        response.setAccount(accountRepository.findAccount(request.getIdentificacao()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllAccountsRequest")
    @ResponsePayload
    public GetAllAccountsResponse getAllAccounts(@RequestPayload GetAllAccountsRequest request){
        GetAllAccountsResponse response = new GetAllAccountsResponse();
        response.setList(accountRepository.findAllAccounts());

        return response;
    }
}
