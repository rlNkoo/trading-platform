package com.rlnkoo.service;

import com.rlnkoo.model.PaymentDetails;
import com.rlnkoo.model.User;

public interface PaymentDetailsService {

    public PaymentDetails addPaymentDetails(String accountNumber, String accountHolderName,
                                            String iban, String bankName, User user);

    public PaymentDetails getUsersPaymentDetails(User user);
}
