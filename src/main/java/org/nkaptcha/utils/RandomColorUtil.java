package org.nkaptcha.utils;

import java.awt.*;
import java.util.Random;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 14:21 2018/4/24.
 */
public class RandomColorUtil {
    public static Color getRandColor() {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }
}
