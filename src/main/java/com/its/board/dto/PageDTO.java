package com.its.board.dto;

import lombok.Data;

@Data
public class PageDTO {
    private int page;// 현제 페이지
    private int maxPage;// 필요한 페이지 갯수
    private int startPage;// 시작 페이지
    private int endPage;//끝페이지
}
