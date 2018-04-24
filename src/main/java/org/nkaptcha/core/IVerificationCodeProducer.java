package org.nkaptcha.core;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:34 2018/4/24.
 */
public interface IVerificationCodeProducer {
    /**
     * get verification code
     * @return
     */
    VerificationModel createVerificationCode();
}
