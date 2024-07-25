package com.example.simple_board.board.db;

import com.example.simple_board.post.db.PostEntity;
import lombok.*;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String boardName;

    private String status;

    // BoardEntity 는 여러 개의 PostEntity 를 가질 수 있다.
    @OneToMany(
            mappedBy = "board"
    ) // 1:N 관계를 뜻함.

    @Where(clause = "status = 'REGISTERED'")
    @Builder.Default
    @org.hibernate.annotations.OrderBy(clause = "id desc")
    private List<PostEntity> postList = List.of();
}
