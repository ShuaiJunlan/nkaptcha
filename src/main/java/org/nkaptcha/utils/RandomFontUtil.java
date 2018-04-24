package org.nkaptcha.utils;

import java.awt.*;
import java.util.Random;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:34 2018/4/24.
 */
public class RandomFontUtil {
    public static Font getFontStyle(int size){
        Random random = new Random();
        Font[] font = new Font[5];
        //good
        font[0] = new Font("Antique Olive Compact", Font.BOLD, size);
        font[1] = new Font("Fixedsys", Font.BOLD, size);
        int a  = random.nextInt(2);
        return font[a];
    }
}
