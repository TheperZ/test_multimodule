package com.api.controller;

import com.api.service.PostService;
import com.dbmodule.dto.PostReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/post")
public class PostController {

    private final PostService postService;


    @PostMapping
    public ResponseEntity<String> savePost(@RequestBody PostReq postReq) {
        postService.savePost(postReq);

        return ResponseEntity.status(201).body("저장 완료");
    }


}
