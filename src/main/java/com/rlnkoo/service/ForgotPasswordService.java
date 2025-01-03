package com.rlnkoo.service;

import com.rlnkoo.domain.VerificationType;
import com.rlnkoo.model.ForgotPasswordToken;
import com.rlnkoo.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp, VerificationType verificationType, String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);
}
