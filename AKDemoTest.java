package com.example.web_management;

import com.aliyun.oss.common.auth.CredentialsProvider;
import com.aliyun.oss.common.auth.DefaultCredentialProvider;
import java.io.FileInputStream;
import java.util.Properties;

public class AkDemoTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        // ����config.ini�ļ�·��
        String configFilePath = "config.ini";

        // ��ȡ�����ļ�
        FileInputStream input = new FileInputStream(configFilePath);
        properties.load(input);
        input.close();

        // �������ļ��л�ȡAK��SK
        String accessKeyId = properties.getProperty("alibaba_cloud_access_key_id");
        String accessKeySecret = properties.getProperty("alibaba_cloud_access_key_secret");

        CredentialsProvider credentialsProvider = new DefaultCredentialProvider(accessKeyId, accessKeySecret);

        // ʹ��credentialsProvider��ʼ���ͻ��˲����к�������...

    }
}
