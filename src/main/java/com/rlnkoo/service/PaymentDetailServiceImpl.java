package com.rlnkoo.service;

import com.rlnkoo.model.PaymentDetails;
import com.rlnkoo.model.User;
import com.rlnkoo.repository.PaymentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentDetailServiceImpl implements PaymentDetailsService {

    @Autowired
    PaymentDetailsRepository paymentDetailsRepository;

    @Override
    public PaymentDetails addPaymentDetails(String accountNumber, String accountHolderName, String iban, String bankName, User user) {

        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setAccountNumber(accountNumber);
        paymentDetails.setAccountHolderName(accountHolderName);
        paymentDetails.setIban(iban);
        paymentDetails.setBankName(bankName);
        paymentDetails.setUser(user);

        return paymentDetailsRepository.save(paymentDetails);
    }

    @Override
    public PaymentDetails getUsersPaymentDetails(User user) {
        return paymentDetailsRepository.findByUserId(user.getId());
    }
}
