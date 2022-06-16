package com.lege.service;

import com.lege.dto.OssCallbackResult;
import com.lege.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author lege
 * @Description oss上传管理Service
 * @create 2022-06-16 10:38
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);


}
