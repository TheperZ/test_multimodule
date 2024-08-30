package com.dbmodule.dto;


import com.dbmodule.domain.Post;

public record PostReq(
        String title,
        String content

) {

    public Post toEntity(PostReq postReq) {

        return Post.builder()
                .title(title)
                .content(content)
                .build();

    }
}
