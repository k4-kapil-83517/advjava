package com.sunbeam.entities;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "Courses")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course {
/*
 * ID (unique identifier for each Course, auto generated, starts from 1)
2. Name (Cannot be Blank, Example : JAVA01, JAVA02, WEBJAVA01, WEBJAVA02)
3. Category (Enum, Example: JAVA-BEGINNER, JAVA-ADVANCED)
4. Start Date (Cannot be Blank)
5. End Date (Cannot be Blank)
6. Fee (Cannot be Blank)
7. Grade to Pass (Cannot be Blank)*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private Long id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(name = "Start_Date")
	private LocalDate startDate;
	@Column(name = "End_Date")
	private LocalDate endDate;
	private double fee;
	@Column(name = "Grade_To_Pass")
	private String gradeToPass;
	
}
