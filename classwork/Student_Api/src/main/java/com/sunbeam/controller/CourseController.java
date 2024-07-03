package com.sunbeam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.dto.AddCourseDto;
import com.sunbeam.dto.ApiResponse;
import com.sunbeam.dto.UpatedDto;
import com.sunbeam.service.CourseService;



@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService courseService;
	@PostMapping
	public ResponseEntity<?> addCourse(@RequestBody AddCourseDto dto){
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(courseService.addNewCourse(dto));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
	}
	@PutMapping("{id}")
	public ResponseEntity<?> updateCourse(@RequestBody UpatedDto dto,@PathVariable Long id){
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(courseService.updateCourse(dto,id));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
	}
	
	@GetMapping("{name}")
	public ResponseEntity<?> getCourse(@PathVariable String name){
		try {
			return ResponseEntity.status(HttpStatus.CREATED).body(courseService.getCourse(name));
		} catch (RuntimeException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse(e.getMessage()));
		}
	}

}
