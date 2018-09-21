package cn.lanqiao.eleven.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.lanqiao.eleven.mapper.AdminMapper;
import cn.lanqiao.eleven.pojo.Admin;
import cn.lanqiao.eleven.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Resource
	AdminMapper adminMapper;
	
	public Admin getAdmin(Admin admin) {
		return adminMapper.getAdmin(admin);
	}

	public void insertAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	public void deleteAdmin(Admin admin) {
		// TODO Auto-generated method stub

	}

	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

}
