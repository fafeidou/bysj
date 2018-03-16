package cn.bysj.core.service.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bysj.core.mapper.ClassesMapper;
import cn.bysj.core.pojo.Classes;
import cn.bysj.core.pojo.ClassesExample;
import cn.bysj.core.pojo.ClassesExample.Criteria;

/**
 * 班级
 * ClassName: ClassesService
 * @Description: TODO
 * @author it小祥
 * @date 2016年11月7日
 */
@Service
public class ClassesServiceImpl implements ClassesService{
	@Autowired
	private ClassesMapper classesMapper;
	@Override
	public List<Classes> getClassByDepartmentID(Integer departmentId) {
		ClassesExample example = new ClassesExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andDepartmentIdEqualTo(departmentId);
		return classesMapper.selectByExample(example);
	}


}
