package com.stream.comment.feedback.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.*;


@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class PostRequest implements Serializable{
	

	private static final long serialVersionUID = 9168466309582045535L;

	private String title;
	private String body;
	private String path;
	//private Boolean deleted;
	//private Long createdBy;
	//private Long modifiedBy;
	//private LocalDateTime created;
	//private LocalDateTime modified;

	
	

}
