package org.nkaptcha.core;

import java.awt.image.BufferedImage;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 20:07 2018/4/24.
 */
public class VerificationModel {
    private String text;
    private BufferedImage bufferedImage;

    public VerificationModel(String text, BufferedImage bufferedImage){
        this.text = text;
        this.bufferedImage = bufferedImage;
    }

    public String getText() {
        return text;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }
}
