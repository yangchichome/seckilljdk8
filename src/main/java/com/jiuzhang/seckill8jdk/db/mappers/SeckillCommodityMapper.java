package com.jiuzhang.seckill8jdk.db.mappers;

import com.jiuzhang.seckill8jdk.db.po.SeckillCommodity;

public interface SeckillCommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillCommodity record);

    int insertSelective(SeckillCommodity record);

    SeckillCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillCommodity record);

    int updateByPrimaryKey(SeckillCommodity record);
}