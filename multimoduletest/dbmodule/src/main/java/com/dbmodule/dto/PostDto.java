package com.dbmodule.dto;

import com.dbmodule.domain.Post;



public record PostDto(
        String title,
        String content
) {

    public PostDto(Post post) {

        this(post.getTitle(), post.getContent());

    }
}
