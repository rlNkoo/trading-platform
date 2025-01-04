package com.rlnkoo.service;

import com.rlnkoo.model.Order;
import com.rlnkoo.model.User;
import com.rlnkoo.model.Wallet;

public interface WalletService {

    Wallet getUserWallet(User user);

    Wallet addBalance(Wallet wallet, Long money);

    Wallet findWalletById(Long id) throws Exception;

    Wallet walletToWalletTransfer(User sender, Wallet receiverWallet, Long amount) throws Exception;

    Wallet payOrderPayment(Order order, User user) throws Exception;
}
