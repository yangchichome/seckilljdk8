package com.jiuzhang.seckill8jdk.db.dao;

import com.jiuzhang.seckill8jdk.db.mappers.SeckillCommodityMapper;
import com.jiuzhang.seckill8jdk.db.po.SeckillCommodity;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SeckillCommodityDaoImpl implements SeckillCommodityDao {

    @Resource
    private SeckillCommodityMapper seckillCommodityMapper;

    @Override
    public SeckillCommodity querySeckillCommodityById(long commodityId) {
        return seckillCommodityMapper.selectByPrimaryKey(commodityId);
    }
}
