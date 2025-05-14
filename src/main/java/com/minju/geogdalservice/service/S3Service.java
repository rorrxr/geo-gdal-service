package com.minju.geogdalservice.service;

import java.io.InputStream;

public interface S3Service {
    // 업로드
    void upload(String bucket, String key, InputStream input);

    // 다운로드
    InputStream download(String bucket, String key);

    // S3 존재 여부 확인 로직 구현
    boolean exists(String bucket, String key);
}