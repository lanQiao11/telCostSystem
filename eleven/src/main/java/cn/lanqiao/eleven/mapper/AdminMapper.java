package cn.lanqiao.eleven.mapper;

import cn.lanqiao.eleven.pojo.Admin;

public interface AdminMapper {
	/**
	 * 登录时获得管理员信息
	 */
	
	Admin getAdmin(Admin admin);
	
	/**
	 * 插入管理员
	 */
	void insertAdmin(Admin admin);
	
	/**
	 * 删除管理员
	 */
	void deleteAdmin(Admin admin);
	
	/**
	 * 修改管理员
	 */
	void updateAdmin(Admin admin);
	
}
