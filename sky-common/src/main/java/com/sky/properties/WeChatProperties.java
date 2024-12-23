package com.sky.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.wechat")
@Data
public class WeChatProperties {
    /**
     * 小程序的appid
     */
    private String appid;

    /**
     * 小程序的秘钥
     */
    private String secret;

    /**
     * 商户号
     */
    private String mchid;

    /**
     * 商户API证书的证书序列号
     */
    private String mchSerialNo;

    /**
     * 商户私钥文件路径
     */
    private String privateKeyFilePath;

    /**
     * 证书解密的密钥
     */
    private String apiV3Key;

    /**
     * 平台证书文件路径
     */
    private String weChatPayCertFilePath;

    /**
     * 支付成功的回调地址
     */
    private String notifyUrl;

    /**
     * 退款成功的回调地址
     */
    private String refundNotifyUrl;


}
