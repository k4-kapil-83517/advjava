package com.sunbeam.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.custom_exceptions.ApiException;
import com.sunbeam.dao.CourseDao;
import com.sunbeam.dao.StudentDao;
import com.sunbeam.dto.AddStudentDto;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.entities.Course;
import com.sunbeam.entities.Student;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Autowired
	private ModelMapper mapper;
	@Autowired
	private CourseDao courseDao;

	@Override
	public ApiResponse addStudent(AddStudentDto dto) {
		Course course= courseDao.findById(dto.getId()).orElseThrow(()->new ApiException("Course not found by this id"));
		Student student=mapper.map(dto, Student.class);
		student.setCourse(course);
		studentDao.save(student);
		return new ApiResponse("Student added successfully");
	}

	@Override
	public List<AddStudentDto> getStudentByCourseName(String name) {
		List<Student> lists = studentDao.findByCourseName(name);
		List<AddStudentDto> listDto = new ArrayList<AddStudentDto>();
		for (Student list : lists) {
			
			AddStudentDto st = mapper.map(list, AddStudentDto.class);
			listDto.add(st);
		}
		return listDto;
	}

}
