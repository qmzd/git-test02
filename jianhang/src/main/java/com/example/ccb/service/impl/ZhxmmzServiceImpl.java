package com.example.ccb.service.impl;

import com.example.ccb.mapper.ZhxmmzMapper;
import com.example.ccb.model.RspMsg;
import com.example.ccb.model.Zhxmmz;
import com.example.ccb.service.ZhxmmzService;
import com.example.ccb.utils.UuidUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashSet;

/**
 * 测试
 * @author Mr_zhao
 * @create 2019/11/4 9:45
 * @day 星期一
 */
@Service
public class ZhxmmzServiceImpl implements ZhxmmzService {

    private static final Logger LOGGER= LoggerFactory.getLogger(ZhxmmzService.class);

    @Resource
    private ZhxmmzMapper zhxmmzMapper;

    @Override
    public RspMsg insert (){
        RspMsg<Object> rspMsg = new RspMsg<>();
        Zhxmmz zhxmmz = new Zhxmmz();
        String numberId = UuidUtils.getNumberId(16);
        zhxmmz.setId(numberId);
        zhxmmz.setDepartment("建行科技部");

        LOGGER.info("对象是："+zhxmmz);
        int insert = zhxmmzMapper.insert(zhxmmz);
        if (1 == insert){
            rspMsg.setOK();
            rspMsg.setMsg("成功");
            rspMsg.setResult(zhxmmz);
        }else {
            rspMsg.setError();
            rspMsg.setMsg("失败");
            rspMsg.setResult(zhxmmz);
        }

        return rspMsg;
    }
}
