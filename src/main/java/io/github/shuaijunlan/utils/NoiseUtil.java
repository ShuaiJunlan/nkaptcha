package io.github.shuaijunlan.utils;

import io.github.shuaijunlan.constant.ParamDefaultValue;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:39 2018/4/24.
 */
public class NoiseUtil {
    private static Integer width = ParamDefaultValue.NKAPTCHA_IMAGE_WIDTH_DV;
    private  static Integer height = ParamDefaultValue.NKAPTCHA_IMAGE_HEIGHT_DV;

    public static void setNoiseLine(Graphics graphics, Integer count){

         Random random = new Random();
        for (int i = 0; i < count; i++) {
            int x1 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int x2 = x1 + random.nextInt(width);
            int y2 = y1 + random.nextInt(height);
            graphics.setColor(RandomColorUtil.getRandColor());
            graphics.drawLine(x1, y1, x2, y2);
        }
    }
    public static void setNoisePoint(BufferedImage bufferedImage){
        Random random = new Random();
        float yawpRate = 0.01f;
        int area = (int) (yawpRate * width * height);
        for (int i = 0; i < area; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            bufferedImage.setRGB(x, y, random.nextInt(255));
        }
    }

}
