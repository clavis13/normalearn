package com.projectA.VO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Al_boardVO {
	
	private Long boardIdx;
	private String userId;
	private String title;
	private String content;
	private String progress;
	private LocalDateTime writeDate;
	// DB없는자료
	private String work;

}
