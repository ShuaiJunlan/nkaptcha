package io.github.shuaijunlan.config;

import io.github.shuaijunlan.constant.ParamDefaultValue;
import io.github.shuaijunlan.constant.ParamKeyConstants;

import java.util.Properties;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 17:11 2018/4/24.
 */
public class Config {

    private Properties properties;
    private ConfigHelper configHelper;

    public Config(Properties properties){
        this.properties = properties;
        this.configHelper = new ConfigHelper();
    }

    public Boolean isNoiseLine(){
        String paramKey = ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getBooleanValue(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_IMAGE_NOISE_LINE_DV);
    }
    public Integer getNoiseLineCount(){
        String paramKey = ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_LINE_COUNT;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getPositiveInt(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_IMAGE_NOISE_LINE_COUNT_DV);

    }
    public Boolean isNoisePoint(){
        String paramKey = ParamKeyConstants.NKAPTCHA_IMAGE_NOISE_POINT;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getBooleanValue(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_IMAGE_NOISE_POINT_DV);
    }

    public String getLanguageValue(){
        String paramKey = ParamKeyConstants.NKAPTCHA_TEXT_LANGUAGE;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getLanguageValue(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_TEXT_LANGUAGE_DV);
    }

    public Integer geTextLenght(){
        String paramKey = ParamKeyConstants.NKAPTCHA_TEXT_LENGTH;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getPositiveInt(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_TEXT_LENGTH_DV);
    }

    public Integer geImageWidth(){
        String paramKey = ParamKeyConstants.NKAPTCHA_IMAGE_WIDTH;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getPositiveInt(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_IMAGE_WIDTH_DV);
    }

    public Integer geImageHeight(){
        String paramKey = ParamKeyConstants.NKAPTCHA_IMAGE_HEIGHT;
        String paramValue = this.properties.getProperty(paramKey);
        return configHelper.getPositiveInt(paramKey, paramValue, ParamDefaultValue.NKAPTCHA_IMAGE_HEIGHT_DV);
    }
}
