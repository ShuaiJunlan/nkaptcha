package io.github.shuaijunlan.core.impl;

import io.github.shuaijunlan.constant.ParamKeyConstants;
import io.github.shuaijunlan.core.VerificationList;
import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:17 2018/4/24.
 */
public class VerificationCodeProducerTest {
    @Test
    public void createVerificationCode1() throws IOException {
        Properties properties = new Properties();
        properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE, "true");
        VerificationList verificationList = new VerificationList(properties);
        BufferedImage bufferedImage = verificationList.pop().getBufferedImage();
        printImage(bufferedImage);
    }
    @Test
    public void createVerificationCode2() throws IOException {
        Properties properties = new Properties();
        properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_POINT, "false");
        VerificationList verificationList = new VerificationList(properties);
        BufferedImage bufferedImage = verificationList.pop().getBufferedImage();
        printImage(bufferedImage);
    }

    @Test
    public void createVerificationCode3() throws IOException {
        Properties properties = new Properties();
        properties.setProperty(ParamKeyConstants.NKAPTCHA_TEXT_LANGUAGE, "zh");
        VerificationList verificationList = new VerificationList(properties);
        BufferedImage bufferedImage = verificationList.pop().getBufferedImage();
        printImage(bufferedImage);
    }

    @Test
    public void createVerificationCode() throws IOException {
        Properties properties = new Properties();
        properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE, "true");
        properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_POINT, "false");
        properties.setProperty(ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE_COUNT, "10");
        VerificationList verificationList = new VerificationList(properties);
        BufferedImage bufferedImage = verificationList.pop().getBufferedImage();
        printImage(bufferedImage);

    }
    public void printImage(BufferedImage bufferedImage) throws IOException {
        String formatName = "jpg";
        String pathName = "F:\\test\\" + System.currentTimeMillis() + ".jpg";
        ImageIO.write(bufferedImage,
                formatName,
                new File(pathName));
    }
}