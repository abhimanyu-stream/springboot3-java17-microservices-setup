package com.stream.comment.feedback.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.stream.comment.feedback.model.Post;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostResponse implements Serializable {

    private List<Post> listOfPost;


}
