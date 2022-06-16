package com.lege.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lege
 * @Description OSS文件上传回调结果
 * @create 2022-06-16 10:38
 */
@Data
public class OssCallbackResult {
    @ApiModelProperty("文件名称")
    private String filename;
    @ApiModelProperty("文件大小")
    private String size;
    @ApiModelProperty("文件的mimeType")
    private String mimeType;
    @ApiModelProperty("图片文件的宽")
    private String width;
    @ApiModelProperty("图片文件的高")
    private String height;
}
