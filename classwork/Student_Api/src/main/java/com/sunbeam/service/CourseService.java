package com.sunbeam.service;

import java.util.List;

import com.sunbeam.dto.AddCourseDto;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.UpatedDto;
import com.sunbeam.entities.Course;

public interface CourseService {
	public ApiResponse addNewCourse(AddCourseDto dto);
	public ApiResponse updateCourse(UpatedDto dto,Long id);
	public List<Course> getCourse(String name);
}
