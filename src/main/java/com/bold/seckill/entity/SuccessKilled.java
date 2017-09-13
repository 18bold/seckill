package com.bold.seckill.entity;

import java.util.Date;

public class SuccessKilled {
	private long seckillId;
	
	private long userPhone;
	
	private short state;
	
	private Date createTime;
	
	//多对一
	private SecKill seckill;
	
	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public long getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}

	public short getState() {
		return state;
	}

	public void setState(short state) {
		this.state = state;
	}

	public Date getCreateDate() {
		return createTime;
	}

	public void setCreateDate(Date createDate) {
		this.createTime = createDate;
	}
	
	public SecKill getSeckill() {
		return seckill;
	}

	public void setSeckill(SecKill seckill) {
		this.seckill = seckill;
	}

	@Override
	public String toString() {
		return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
				+ ", createDate=" + createTime + "]";
	}
	
}
