package com.givemegym.courseschedule.service;
<<<<<<< HEAD
import com.givemegym.courseschedule.vo.*;

import java.util.List;
import java.util.Optional;


public interface CourseScheduleService {
	
	boolean isDup(Integer COURSESCHEDULE_ID);
	
	/*新增、修改*/
	CourseScheduleVo saveOrUpdate(CourseScheduleVo coursescheduleVo);
	
	 /*刪除 根據ID刪除單一問題*/
	void deleteById(Integer CourseScheduleId);
	
		
	 /*查詢 根據ID查單一問題 Optional避免空值例外*/
    Optional<CourseScheduleVo> findById(Integer CourseScheduleId);
    
    
    /*查詢所有問題*/
    List<CourseScheduleVo> findAll();

    
    /*根據問題類別(四種類別)查問題*/
    List<CourseScheduleVo> findByCourseScheduleId(Integer CourseScheduleId);
}
=======

import com.givemegym.courseschedule.vo.CourseSchedule;
import com.givemegym.period.vo.Period;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

public interface CourseScheduleService {

    boolean isDup(Integer CourseScheduleId);

    /*新增、修改*/
    CourseSchedule saveOrUpdate(CourseSchedule courseschedule);

    /*刪除 根據ID刪除單一上課時段*/
    void deleteById(Integer courseScheduleId);

    /*查詢 根據ID查單一上課時段 Optional避免空值例外*/
    Optional<CourseSchedule> findById(Integer CourseScheduleId);

    /*查詢所有上課時段*/
    List<CourseSchedule> findAll();

    //   查詢報名時段為XXX的上課時段
    List<CourseSchedule> findCourseScheduleByPeriod(Period period);

    //  查詢狀態為XXX的上課時段
    List<CourseSchedule> findCourseSchedulesByCourseScheduleState(String courseState);

    //  當報名時段為XXX時即更新上課狀態為'已取消'
    void updateCourseScheduleStateToOffByPeriod(Period period);


    CourseSchedule findCourseScheduleByCourseScheduleDateAndCourseScheduleTime(Date courseScheduleDate, String CourseScheduleTime);
}

>>>>>>> Calara
