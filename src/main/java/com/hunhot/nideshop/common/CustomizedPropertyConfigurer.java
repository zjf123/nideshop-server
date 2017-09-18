package com.hunhot.nideshop.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * TODO 描述
 * Created by bd007 on 2017/9/18.
 */
public class CustomizedPropertyConfigurer extends PropertyPlaceholderConfigurer {

    private static Logger logger = LoggerFactory.getLogger(CustomizedPropertyConfigurer.class);
    private static Map<String, String> propertiesMap;

    /**
     * GrowingUI接入配置地址
     */
    public static final String GROWINGIOURL = "GrowingIOUrl";

    static {
        propertiesMap = new HashMap<String, String>();
    }

    @Override
    protected void processProperties(ConfigurableListableBeanFactory beanFactory,
                                     Properties props) {
        try {
            super.processProperties(beanFactory, props);

            /**设置属性字典*/
            for (Object key : props.keySet()) {
                String keyStr = key.toString();
                String value = props.getProperty(keyStr);
                propertiesMap.put(keyStr, value);
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage(), "processProperties初始化属性集合出错");
        }
    }

    /**
     * @Des: 获取配置项
     * @param：属性名称
     */
    public static String getContextProperty(String name) {
        String value = "";
        try {

            if (null != name && name.length() > 0) {
                return propertiesMap.get(name);
            }

        } catch (Exception ex) {
            logger.error(ex.getMessage(), String.format("根据属性名称:%s获取属性值出错：%s", name, ex.getMessage()));
        }
        return value;
    }

}
