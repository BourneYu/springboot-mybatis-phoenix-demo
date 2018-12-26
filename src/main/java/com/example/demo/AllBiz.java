package com.example.demo;

import java.io.Serializable;
import java.sql.Timestamp;

public class AllBiz implements Serializable {
	
	private static final long serialVersionUID = 3640944264540399973L;
	private String  serviceid;
	private String  updateTime;
	private Integer minTime;
	private Integer maxTime;
	private Float   avgTime;
	private Long    totalNums;
	private Timestamp bizTime;
	
	public AllBiz() {
		super();
	}
	
	public AllBiz(String serviceid, String updateTime, Integer minTime, Integer maxTime, Float avgTime, Long totalNums,
			Timestamp bizTime) {
		super();
		this.serviceid = serviceid;
		this.updateTime = updateTime;
		this.minTime = minTime;
		this.maxTime = maxTime;
		this.avgTime = avgTime;
		this.totalNums = totalNums;
		this.bizTime = bizTime;
	}

	public String getServiceid() {
		return serviceid;
	}

	public void setServiceid(String serviceid) {
		this.serviceid = serviceid;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getMinTime() {
		return minTime;
	}

	public void setMinTime(Integer minTime) {
		this.minTime = minTime;
	}

	public Integer getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(Integer maxTime) {
		this.maxTime = maxTime;
	}

	public Float getAvgTime() {
		return avgTime;
	}

	public void setAvgTime(Float avgTime) {
		this.avgTime = avgTime;
	}

	public Long getTotalNums() {
		return totalNums;
	}

	public void setTotalNums(Long totalNums) {
		this.totalNums = totalNums;
	}

	public Timestamp getBizTime() {
		return bizTime;
	}

	public void setBizTime(Timestamp bizTime) {
		this.bizTime = bizTime;
	}

	@Override
	public String toString() {
		return "AllBiz [serviceid=" + serviceid + ", updateTime=" + updateTime + ", minTime=" + minTime + ", maxTime="
				+ maxTime + ", avgTime=" + avgTime + ", totalNums=" + totalNums + ", bizTime=" + bizTime + "]";
	}
	
}
