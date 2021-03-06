package cn.edu.gcu.oa.service.impl;

import org.springframework.stereotype.Service;

import cn.edu.gcu.oa.base.DaoSupportImpl;
import cn.edu.gcu.oa.entity.Role;
import cn.edu.gcu.oa.service.RoleService;

@Service
//事务已经从DaoSupportImpl继承过来了无需再定义
//@Transactional
public class RoleServiceImpl extends DaoSupportImpl<Role> implements RoleService {
	
}
