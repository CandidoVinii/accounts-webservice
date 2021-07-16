package com.soapwebservice.accounts;

import com.sensedia.xml.account.AccountDetailsRequest;
import com.sensedia.xml.account.AccountDetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AccountEndpoint {

    private static final String NAMESPACE_URI = "http://www.sensedia.com/xml/bank";

    private AccountRepository AccountRepository;

    @Autowired
    public AccountEndpoint(AccountRepository AccountRepository) {
        this.AccountRepository = AccountRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AccountDetailsRequest")
    @ResponsePayload
    public AccountDetailsResponse getAccount(@RequestPayload AccountDetailsRequest request) {
        AccountDetailsResponse response = new AccountDetailsResponse();
        response.setAccount(AccountRepository.findAccount(request.getIdentificacao()));

        return response;
    }

}
