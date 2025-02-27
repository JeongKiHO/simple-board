package com.example.simple_board.post.controller;

import com.example.simple_board.common.Api;
import com.example.simple_board.post.db.PostEntity;
import com.example.simple_board.post.model.PostRequest;
import com.example.simple_board.post.model.PostViewRequest;
import com.example.simple_board.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostApiController {

    private final PostService postService;

    @PostMapping("")
    public PostEntity create(
            @Valid
            @RequestBody // JSON Body 로 받겠다.
            PostRequest postRequest // 요청 들어오는 PostRequest 는 Valid 를 통해서 검증한다.
    ){
        return postService.create(postRequest);
    }

    @PostMapping("/view")
    public PostEntity view(
            @Valid
            @RequestBody PostViewRequest postViewRequest
    ){
        return postService.view(postViewRequest);
    }

    @GetMapping("/all")
    public Api<List<PostEntity>> list(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.DESC)
            Pageable pageable

    ){
        return postService.all(pageable);
    }

    @PostMapping("/delete")
    public void delete(
        @Valid
        @RequestBody PostViewRequest postViewRequest
    ){
        postService.delete(postViewRequest);
    }
}
