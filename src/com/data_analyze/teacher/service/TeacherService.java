package com.data_analyze.teacher.service;

import com.data_analyze.core.service.BaseService;
import com.data_analyze.teacher.entity.Teacher;

import java.io.File;

/**
 * Created by liujie on 2017/3/16.
 */
public interface TeacherService extends BaseService<Teacher>{

    public int insertTeacher(Teacher teacher);


    public void importTeacherTable(File excel , String fileType);


    public void importTeacher(File excel , String fileType);

    public String getSalaryIdFromName(String name);


    public void hello();

}
