package com.minju.geogdalservice.entity;

import lombok.Data;

// JSON에서 객체
@Data
public class JsonInfo {
    private String username;
    private String access_key_id;
    private String secret_access_key;
    private String bucket_name;
    private String folder_path;
    private String region;
}