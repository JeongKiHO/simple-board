package com.example.simple_board.reply.controller;

import com.example.simple_board.crud.CRUDApiAbstractApiController;
import com.example.simple_board.reply.db.ReplyEntity;
import com.example.simple_board.reply.model.ReplyDto;
import com.example.simple_board.reply.model.ReplyRequest;
import com.example.simple_board.reply.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/reply")
@RequiredArgsConstructor
public class ReplyApiController extends CRUDApiAbstractApiController<ReplyDto, ReplyEntity> {

    /*private final ReplyService replyService;

    @PostMapping("")
    public ReplyEntity create(
            @Valid
            @RequestBody ReplyRequest replyRequest
    ){
        return replyService.create(replyRequest);
    }*/
}
