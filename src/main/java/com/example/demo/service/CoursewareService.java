package com.example.demo.service;

import com.example.demo.entity.Courseware;

public interface CoursewareService {
    int insertCourseware(Courseware courseware);
    int deleteCourseware(int wid);
    Courseware selectCourseware(int wid);
}
