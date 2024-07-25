package com.example.simple_board.crud;

public interface Converter<DTO, ENTITY> {

    DTO toDto(ENTITY entity); // ENTITY 를 받아서 DTO 로 반환

    ENTITY toEntity(DTO dto); // DTO 를 받아서 ENTITY 로 반환
}
