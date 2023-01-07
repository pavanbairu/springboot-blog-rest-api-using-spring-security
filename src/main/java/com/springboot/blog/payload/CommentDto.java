package com.springboot.blog.payload;

import lombok.Data;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Data
public class CommentDto {

        private Long id;

        @NotEmpty(message = "must not be empty")
        @Size(max = 30, message = "should not be more than 30 characters")
        private String name;

        @NotEmpty(message = "must not be empty")
        @Email(message = "should contain @gmail.com")
        private String email;

        @NotEmpty(message = "must not be empty")
        private String body;
}
