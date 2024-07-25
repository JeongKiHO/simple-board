package com.example.simple_board.common;

import lombok.*;

import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagination {

    private Integer page;

    private Integer size;

    private Integer currentElements;

    private Integer totalPage;

    private Long totalElements;
}
