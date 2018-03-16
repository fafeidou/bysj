package cn.bysj.core.service.student;

import java.util.List;

import cn.bysj.core.pojo.Classes;

/**
 * 班级
 * ClassName: ClassesService
 * @Description: TODO
 * @author it小祥
 * @date 2016年11月7日
 */
public interface ClassesService {
	/*
	 * 通过院系id去查询班级
	 */
	List<Classes> getClassByDepartmentID(Integer departmentId);

}
