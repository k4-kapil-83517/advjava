package com.sunbeam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.custom_exceptions.ApiException;
import com.sunbeam.dao.CourseDao;
import com.sunbeam.dto.AddCourseDto;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.UpatedDto;
import com.sunbeam.entities.Course;
@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;
	@Autowired
	private ModelMapper mapper;

	@Override
	public ApiResponse addNewCourse(AddCourseDto dto) {
	Course course=mapper.map(dto, Course.class);
	courseDao.save(course);
	return new ApiResponse("Course added successfully");
	}
	@Override
	public ApiResponse updateCourse(UpatedDto dto, Long id) {
		Course course=courseDao.findById(id).orElseThrow(()->new ApiException("Course not found"));
		course.setStartDate(dto.getStartDate());
		course.setEndDate(dto.getEndDate());
		course.setFee(dto.getFee());
		courseDao.save(course);
		return new ApiResponse("course updated successfully");
	}
	@Override
	public List<Course> getCourse(String name) {
		return courseDao.findByName(name);
		
	}

}
