package com.sunbeam.dto;

import java.time.LocalDate;

import com.sunbeam.entities.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseDto {
	private String name;
	private Category category;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fee;
	private String gradeToPass;
}
