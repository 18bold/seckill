package com.bold.seckill.dao;

import java.util.Date;
import java.util.List;

import com.bold.seckill.entity.SecKill;
import org.apache.ibatis.annotations.Param;

public interface SecKillDao {
	/**
	 * 减库存
	 * @param seckillId
	 * @param killTime
	 * @return
	 */
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

	/**
	 * 查询详情
	 * @param secKillId
	 * @return
	 */
	SecKill queryById(long secKillId);

	/**
	 * 根据偏移量获取秒杀列表
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<SecKill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
