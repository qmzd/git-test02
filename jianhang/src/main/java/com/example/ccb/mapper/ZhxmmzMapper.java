package com.example.ccb.mapper;

import com.example.ccb.model.Zhxmmz;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ZhxmmzMapper {
    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(String id);

    /**
     * 新增
     * @param record
     * @return
     */
    int insert(Zhxmmz record);

    /**
     *
     * @param record
     * @return
     */
    int insertSelective(Zhxmmz record);

    /**
     * 根据主键查询
     * @param id
     * @return
     */
    Zhxmmz selectByPrimaryKey(String id);

    /**
     * 根据主键修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Zhxmmz record);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(Zhxmmz record);
}