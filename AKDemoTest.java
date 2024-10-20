package com.example.web_management;

import com.aliyun.oss.common.auth.CredentialsProvider;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import java.io.FileInputStream;
import java.util.Properties;

public class AkDemoTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        // 设置config.ini文件路径
        String configFilePath = "config.ini";

        // 读取配置文件
        FileInputStream input = new FileInputStream(configFilePath);
        properties.load(input);
        input.close();

        // 从配置文件中获取AK和SK
        String accessKeyId = properties.getProperty("alibaba_cloud_access_key_id");
        String accessKeySecret = properties.getProperty("alibaba_cloud_access_key_secret");

        CredentialsProvider credentialsProvider = new DefaultCredentialProvider(accessKeyId, accessKeySecret);

        // 使用credentialsProvider初始化客户端并进行后续操作...

    }
}
