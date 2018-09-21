package cn.lanqiao.eleven.service;

import cn.lanqiao.eleven.pojo.Admin;

public interface AdminService {
	
	/**
	 * 登录时获取管理员全部信息
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
	 * 修改管理员信息
	 */
	void updateAdmin(Admin admin);
	
}
