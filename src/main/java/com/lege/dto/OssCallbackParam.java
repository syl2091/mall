package com.lege.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author lege
 * @Description oss上传成功后的回调参数
 * @create 2022-06-16 10:37
 */
@Data
public class OssCallbackParam {
    @ApiModelProperty("请求的回调地址")
    private String callbackUrl;
    @ApiModelProperty("回调是传入request中的参数")
    private String callbackBody;
    @ApiModelProperty("回调时传入参数的格式，比如表单提交形式")
    private String callbackBodyType;
}
