package com.sunbeam.dto;

import java.time.LocalDate;
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
public class UpatedDto {
	/*. Update Course Details (Start Date, End Date & Fee can be updated)*/
	//private Long id;
	private LocalDate startDate;
	private LocalDate endDate;
	private double fee;

}
