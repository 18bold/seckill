package com.bold.seckill.service;

import com.bold.seckill.dto.Exposer;
import com.bold.seckill.dto.SeckillExecution;
import com.bold.seckill.entity.SecKill;
import com.bold.seckill.exception.RepeatKillException;
import com.bold.seckill.exception.SeckillCloseException;
import com.bold.seckill.exception.SeckillException;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口
 * 三个方面：方法定义粒度，参数，返回类型
 */
public interface SeckillService {

    /**
     * 查询所有秒杀
     * @return
     */
    List<SecKill> getSeckillList();

    /**
     * 查询单个秒杀记录
     * @param seckillId
     * @return
     */
    SecKill getById(long seckillId);

    /**
     * 秒杀开始 输出地址
     * 否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param md5
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
    throws SeckillException,SeckillCloseException,RepeatKillException;
}
