package io.github.shuaijunlan.config;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 15:34 2018/4/25.
 */
public class ConfigException extends RuntimeException {
    private static final long serialVersionUID = 6937416954897707291L;

    public ConfigException(String paramName, String paramValue, Throwable cause) {
        super("Invalid value '" + paramValue + "' for config parameter '"
                + paramName + "'.", cause);
    }

    public ConfigException(String paramName, String paramValue, String message) {
        super("Invalid value '" + paramValue + "' for config parameter '"
                + paramName + "'. " + message);
    }
}
