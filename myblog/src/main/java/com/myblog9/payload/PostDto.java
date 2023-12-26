package com.myblog9.payload;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String title;

    @NotEmpty
    private String description;

    @NotEmpty
    private String content;
}
