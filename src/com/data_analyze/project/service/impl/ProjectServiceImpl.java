package com.data_analyze.project.service.impl;

import com.data_analyze.core.entity.Page;
import com.data_analyze.project.dao.ProjectMapper;
import com.data_analyze.project.entity.Project;
import com.data_analyze.project.service.ProjectService;
import com.data_analyze.teacher.dao.TeacherMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Created by jiacheng on 17-3-19.
 */
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
//    @Autowired
//    private TeacherMapper teacherMapper;

    @Autowired
    private ProjectMapper projectMapper;

    @Override
    public int insert(Project entity) throws Exception {
        return 0;
    }

    @Override
    public int update(Project entity) throws Exception {
        return 0;
    }

    @Override
    public void importProject(File excel, String fileType, int year) {
//        try {
//            FileInputStream fileInputStream = new FileInputStream(excel);
//            boolean is03Excel = fileType.equals("xls");
//            Workbook workbook = is03Excel ? new HSSFWorkbook(fileInputStream) : new XSSFWorkbook(fileInputStream);
//            Sheet sheet = workbook.getSheetAt(0);
//            Project project = new Project();
//            for(int j=1; j<((year==2015)?132:98); ++j){
//                Row row = sheet.getRow(j);
//                String name = row.getCell(1).getStringCellValue().trim();
//                String salary_id = teacherMapper.getSalaryIdFromName(name);
//                if(salary_id == null){
//                    continue;
//                }
//                System.out.println(name+" salaryId"+salary_id);
//                for(int i = 0; i<=3; ++i){
//                    if(row.getCell(i)!=null) {
//                        row.getCell(i).setCellType(Cell.CELL_TYPE_STRING);
//                    }
//                }
//                project.setSalary_id(salary_id);
//                project.setName(name);
//                String budget_in_acc = row.getCell(2).getStringCellValue();
//                if(budget_in_acc == null || "".equals(budget_in_acc)){
//                    System.out.println(year + name + "budget_in_all null");
//                    continue;
//                }
//                project.setBudget_in_acc(Float.valueOf(budget_in_acc));
//                String V_or_H = row.getCell(3).getStringCellValue();
//                System.out.println("get v_or_h "+V_or_H );
//                int v_or_h_num = Integer.valueOf(V_or_H);
//                project.setV_or_H(v_or_h_num==0?Boolean.FALSE:Boolean.TRUE);
//                System.out.println(project);
//                if (year == 2015){
//                    projectMapper.insert2015(project);
//                } else {
//                    projectMapper.insert2016(project);
//                }
//            }
//            System.out.println(year + "ok");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public int delete(Project entity) throws Exception {
        return 0;
    }

    @Override
    public Project select(Project entity) throws Exception {
        return null;
    }

    @Override
    public Page<Project> selectPage(Page<Project> page) {
        return null;
    }

    @Override
    public Page<Project> selectPageUseDyc(Page<Project> page) {
        return null;
    }

    @Override
    public int insertDynamic(@Param("teach") Project entity, @Param("tableName") String tableName) {
        return 0;
    }

    @Override
    public Page<Project> selectPageListDynamic(@Param("pages") Page<Project> page, @Param("tableName") String tableName) {
        return null;
    }

    @Override
    public int selectPageCountDynamic(@Param("tableName") String tableName) {
        return 0;
    }

    @Override
    public int deleteDynamic(@Param("tablesName") String tableName, @Param("items") Project entity) {
        return 0;
    }

    @Override
    public Project selectDynamic(@Param("tableName") String table, @Param("items") Project entity) {
        return null;
    }

    @Override
    public int updateDynamic(@Param("tableName") String tableName, @Param("items") Project entity) {
        return 0;
    }
}
