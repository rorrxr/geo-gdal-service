package com.minju.geogdalservice.dto;

import lombok.Data;

@Data
public class MetadataDto {
    private String fileName;
    private int width;
    private int height;
    private int bandCount;
}