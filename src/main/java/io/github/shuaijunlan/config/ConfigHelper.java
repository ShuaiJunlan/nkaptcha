package io.github.shuaijunlan.config;


/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:34 2018/4/25.
 */
public class ConfigHelper {
    public Integer getPositiveInt(String paramName, String paramValue, Integer defaultInt) {
        Integer intValue;
        if ("".equals(paramValue) || paramValue == null) {
            intValue = defaultInt;
        } else {
            try {
                intValue = Integer.parseInt(paramValue);
                if (intValue < 1) {
                    throw new ConfigException(paramName, paramValue, "Value must be greater than or equals to 1.");
                }
            } catch (NumberFormatException nfe) {
                throw new ConfigException(paramName, paramValue, nfe);
            }
        }
        return intValue;
    }

    public Boolean getBooleanValue(String paramName, String paramValue, Boolean defaultValue){
        String[] isOrNot = {"true", "false"};
        Boolean initValue;
        if ("".equals(paramValue) || paramValue == null){
            initValue = defaultValue;
            return initValue;
        }
        Boolean temp = !isOrNot[0].equals(paramValue) && !isOrNot[1].equals(paramValue);
        if (temp){
            throw new ConfigException(paramName, paramValue, "Value must be 'true' or 'false'");
        }
        initValue = Boolean.parseBoolean(paramValue);
        return initValue;
    }

    public String getLanguageValue(String paramName, String paramValue, String defaultValue){
        String initValue = "";
        if (paramValue == null || "".equals(paramValue)){
            initValue = defaultValue;
        }
        String[] lan = {"en", "zh"};
        if (!lan[0].equals(paramValue) && !lan[1].equals(paramValue)){
            throw new ConfigException(paramName, paramValue, "Value must be 'en' or 'zh'");
        }
        if (lan[0].equals(paramValue)){
            initValue = "en";
        }
        if (lan[1].equals(paramValue)){
            initValue = "zh";
        }
        return initValue;
    }
}
