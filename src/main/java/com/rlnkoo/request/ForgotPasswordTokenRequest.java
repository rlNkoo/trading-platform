package com.rlnkoo.request;

import com.rlnkoo.domain.VerificationType;
import lombok.Data;

@Data
public class ForgotPasswordTokenRequest {

    private String sendTo;

    private VerificationType verificationType;
}
