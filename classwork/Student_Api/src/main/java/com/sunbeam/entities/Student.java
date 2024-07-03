package com.sunbeam.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "Students")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	/*1. Sid (unique identifier for each Student)
2. Sname (Cannot be Blank)
3. Email (Cannot be Blank)
4. Password (Cannot be Blank)
5. Cid (Course ID, FK)*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Student_id" ,unique = true)
	private Long sid;
	@Column(name = "Student_Name")
	private String sName;
	private String email;
	private String password;
	@ManyToOne
	@JoinColumn(name = "id",nullable = false)
	private Course course;
}
