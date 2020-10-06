package com.leafmirror.malllearning.service;

import com.leafmirror.malllearning.dto.OssCallbackParam;
import com.leafmirror.malllearning.dto.OssCallbackResult;
import com.leafmirror.malllearning.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
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
