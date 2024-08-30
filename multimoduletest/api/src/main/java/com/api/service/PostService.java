package com.api.service;

import com.dbmodule.domain.Post;
import com.dbmodule.dto.PostDto;
import com.dbmodule.dto.PostReq;
import com.dbmodule.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<PostDto> findPost(String q) {

        List<Post> entityResult = postRepository.findByTitleContaining(q);

        List<PostDto> result = entityResult.stream()
                .map((e) -> new PostDto(e))
                .collect(Collectors.toList());

        return result;

    }
}
