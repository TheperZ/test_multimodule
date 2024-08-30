package com.api.service;

import com.dbmodule.domain.Post;
import com.dbmodule.dto.PostReq;
import com.dbmodule.repository.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    public void savePost(PostReq postReq) {

        Post post = postReq.toEntity(postReq);

        postRepository.save(post);


    }
}
