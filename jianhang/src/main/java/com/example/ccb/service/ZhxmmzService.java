package com.example.ccb.service;

import com.example.ccb.mapper.ZhxmmzMapper;
import com.example.ccb.model.RspMsg;
import com.example.ccb.model.Zhxmmz;
import com.example.ccb.utils.UuidUtils;
import org.apache.commons.beanutils.ConvertUtilsBean2;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 测试
 * @author Mr_zhao - 过河卒
 * @create 2019/11/4 9:45
 * @day 星期一
 */
public interface ZhxmmzService {

    /**
     * 新增
     * @return
     */
    public RspMsg insert ();

}
