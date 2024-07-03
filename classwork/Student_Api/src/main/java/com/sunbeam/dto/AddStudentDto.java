package com.sunbeam.dto;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@Service
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class AddStudentDto {
	private String sName;
	private String email;
	private String password;
	private Long id;

}
