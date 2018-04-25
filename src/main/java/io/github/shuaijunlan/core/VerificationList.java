package io.github.shuaijunlan.core;

import io.github.shuaijunlan.core.impl.VerificationCodeProducer;

import java.util.LinkedList;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:02 2018/4/24.
 */
public class VerificationList {

    private static int defaultSize = 64;
    private static LinkedList<VerificationModel> verificationModels = new LinkedList<>();
    private static IVerificationCodeProducer verificationCodeProducer = new VerificationCodeProducer();

    public static synchronized VerificationModel pop(){
        if (verificationModels.size() <= 0){
            fill();
        }
        return verificationModels.pop();
    }

    private static void fill(){
        for (int i = 0; i < defaultSize; i++){
            verificationModels.add(verificationCodeProducer.createVerificationCode());
        }
    }

}
