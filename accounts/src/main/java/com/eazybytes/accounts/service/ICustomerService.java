package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {

    /**
     * Fetch customer details from Accounts, Cards and Loans.
     *
     * @param mobileNumber  Input mobile number
     * @param correlationId
     * @return CustomerDetails based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId);
}
