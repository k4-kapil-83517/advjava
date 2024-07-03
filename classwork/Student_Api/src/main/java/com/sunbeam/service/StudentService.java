package com.sunbeam.service;

import java.util.List;

import com.sunbeam.dto.AddStudentDto;
import com.sunbeam.dto.ApiResponse;

public interface StudentService {
 public ApiResponse addStudent(AddStudentDto dto);
 public List<AddStudentDto> getStudentByCourseName(String name);
}
