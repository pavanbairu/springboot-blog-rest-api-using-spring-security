package com.springboot.blog.payload;

import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {

    private Long id;

    @NotEmpty(message = "must not be empty")
    @Size(min = 4, message = "post title should have at least 4 characters")
    private String title;

    @NotEmpty(message = "must not be empty")
    @Size(min = 5, message = "post description should have at least 5 characters")
    private String description;

    @NotEmpty(message = "must not be empty")
    private String content;
    private Set<CommentDto> comments;
}
