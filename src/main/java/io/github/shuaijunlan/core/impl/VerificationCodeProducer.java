package io.github.shuaijunlan.core.impl;

import io.github.shuaijunlan.constant.ParamDefaultValue;
import io.github.shuaijunlan.core.IVerificationCodeProducer;
import io.github.shuaijunlan.core.VerificationModel;
import io.github.shuaijunlan.utils.NoiseUtil;
import io.github.shuaijunlan.utils.RandomFontUtil;
import io.github.shuaijunlan.utils.RandomTextUtil;
import io.github.shuaijunlan.utils.RandomColorUtil;

import java.awt.*;
import java.awt.image.BufferedImage;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:38 2018/4/24.
 */
public class VerificationCodeProducer implements IVerificationCodeProducer {

    private static Integer width = ParamDefaultValue.NKAPTCHA_IMAGE_WIDTH_DV;
    private  static Integer height = ParamDefaultValue.NKAPTCHA_IMAGE_HEIGHT_DV;
    private static  Integer charLength = ParamDefaultValue.NKAPTCHA_TEXT_LENGTH_DV;

    private static int fontWidth = width  / charLength;
    private static int fontHeight = fontWidth;
    private static int codeY = height - (height >> 2);

    private String text;

    @Override
    public VerificationModel createVerificationCode() {

        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        Graphics graphics = bufferedImage.getGraphics();

        if (ParamDefaultValue.NKAPTCHA_RANDOM_BACKGROUND_DV){
            graphics.setColor(RandomColorUtil.getRandColor());
        }
        graphics.fillRect(0, 0, width, height);
        Font font = RandomFontUtil.getFontStyle(fontHeight);
        graphics.setFont(font);
        if (ParamDefaultValue.NKAPTCHA_IMAGE_NOISE_LINE_DV){
            NoiseUtil.setNoiseLine(graphics);
        }
        if (ParamDefaultValue.NKAPTCHA_NOISE_POINT_DV){
            NoiseUtil.setNoisePoint(bufferedImage);
        }
        text = RandomTextUtil.randomText();
        drawFont(text, graphics);

        VerificationModel model = new VerificationModel(text, bufferedImage);
        return model;
    }

    private void drawFont(String str, Graphics graphics){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            graphics.setColor(RandomColorUtil.getRandColor());
            graphics.drawString(String.valueOf(chars[i]), i * fontWidth, codeY);
        }
    }
}
