package com.ttfc.soa.dubbo.provider.service.impl;


import com.ttfc.soa.dubbo.provider.domain.BranchCompany;
import com.ttfc.soa.dubbo.provider.mapper.BranchCompanyMapper;
import com.ttfc.soa.dubbo.provider.service.BranchCompanyService;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("braComService")
/*
 * 此处注解在Spring-Dubbo.xml文件中用到： <!--声明需要暴露的服务接口 -->
 * <dubbo:serviceinterface="com.ouc.service.BranchCompanyService"ref=
 * "braComService"/>
 */
public class BranchCompanySerImpl implements BranchCompanyService {

	@Resource
	BranchCompanyMapper branchCompanyMapper;

	public List<BranchCompany> getBranchCompanys() {
		return branchCompanyMapper.getBraComsFromDataBase();
	}

	public int saveBranchCompany(BranchCompany branchCompany) {
		return branchCompanyMapper.insertBranchCompany(branchCompany);
	}

	@Override
	public int deleteBranchCompany(BranchCompany branchCompany) {
		return branchCompanyMapper.deleteBranchCompany(branchCompany);
	}

	@Override
	public int updateBranchCompany(BranchCompany branchCompany) {
		return branchCompanyMapper.updateBranchCompany(branchCompany);
	}

	@Override
	public BranchCompany getBranchCompanyById(int id) {
		return branchCompanyMapper.selectBranchCompany(id);
	}
}
