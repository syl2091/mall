package com.lege.service;

import com.lege.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author lege
 * @Description 会员浏览记录管理Service
 * @create 2022-06-15 13:57
 */
public interface MemberReadHistoryService {
    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
