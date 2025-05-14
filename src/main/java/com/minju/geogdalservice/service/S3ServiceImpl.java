package com.minju.geogdalservice.service;

import org.springframework.stereotype.Service;

import java.io.InputStream;

@Service
public class S3ServiceImpl implements S3Service {

    @Override
    public void upload(String bucket, String key, InputStream input) {
        // S3 업로드 로직 구현
        System.out.printf("Uploading to bucket: %s, key: %s%n", bucket, key);
    }

    @Override
    public InputStream download(String bucket, String key) {
        // S3 다운로드 로직 구현
        System.out.printf("Downloading from bucket: %s, key: %s%n", bucket, key);
        InputStream input = getClass().getClassLoader().getResourceAsStream(key);
        if (input == null) {
            throw new RuntimeException("파일을 찾을 수 없습니다: " + key);
        }
        return input;
    }



    @Override
    public boolean exists(String bucket, String key) {
        // S3 존재 여부 확인 로직 구현
        System.out.printf("Checking existence in bucket: %s, key: %s%n", bucket, key);
        return false;
    }
}