package io.github.shuaijunlan.core.impl;

import io.github.shuaijunlan.core.VerificationList;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:17 2018/4/24.
 */
public class VerificationCodeProducerTest {

    @Test
    public void createVerificationCode() throws IOException {
        BufferedImage bufferedImage = VerificationList.pop().getBufferedImage();
        String formatName = "jpg";
        String pathName = "F:\\test\\" + System.currentTimeMillis() + ".jpg";
        ImageIO.write(bufferedImage,
                formatName,
                new File(pathName));
    }
}