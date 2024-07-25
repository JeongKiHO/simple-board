package com.example.simple_board.reply.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ReplyRequest {

    @NonNull
    private Long postId;

    @NotBlank
    private String userName; // 관리자 이름

    @NotBlank
    @Size(min = 4, max = 4)
    private String password; // 답변에 대한 비밀번호

    @NotBlank
    private String title;

    @NotBlank
    private String content;
}
