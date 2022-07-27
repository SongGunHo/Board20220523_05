package com.its.board.service;

import com.its.board.dto.BoardDTO;
import com.its.board.dto.PageDTO;
import com.its.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BoardServices {
    @Autowired
    BoardRepository boardRepository;
    public boolean save(BoardDTO boardDTO) {
     int a=   boardRepository.save(boardDTO);
     if(a>0){
         return true;
     }else {
         return false;
     }
    }

    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }

    public BoardDTO detail(Long id) {
    return boardRepository.detail(id);

    }
    private static final int PAGE_LIMIT = 3;// 한페이지 보여주고자 하는 글 갯수
    private static final int BLOCK_LIMIT = 3; // 페이지 갯수
    /**
     * 요청한 페이지 해당 하는 글 목록을 DB에서 가져오는 역활
     */
    public List<BoardDTO> pagingList(int page) {
        // 1페이지 요청 =>
        int pagingStart = (page-1) * PAGE_LIMIT;
        Map<String, Integer> pagingParam = new HashMap<>();
        pagingParam.put("start", pagingStart);
        pagingParam.put("limit", PAGE_LIMIT);
        List<BoardDTO> pagingList = boardRepository.pagingList(pagingParam);
        return pagingList;
    }
    public PageDTO paging(int page) {
        int boardCount = boardRepository.boardCount();// 글 갯수  조회
        // 필요한 전체 페이지 갯수
        // 10. 3 10/3 =3.3333=>4
        int maxPage = (int)(Math.ceil((double)boardCount / PAGE_LIMIT));
        // 시작 페이지 1,4,7,10
        int startPage = (((int)(Math.ceil((double)page / BLOCK_LIMIT))) - 1) * BLOCK_LIMIT + 1;
        // 끝페이지 3,6,9,12
        int endPage = startPage + BLOCK_LIMIT - 1;
        if(endPage > maxPage)
            endPage = maxPage;
        PageDTO paging = new PageDTO();
        paging.setPage(page);
        paging.setStartPage(startPage);
        paging.setEndPage(endPage);
        paging.setMaxPage(maxPage);
        return paging;
    }


    public List<BoardDTO> search(String searchType, String q) {
        Map<String , String> searchParam= new HashMap<>();
        searchParam.put("type", searchType);
        searchParam.put("q",q);
        List<BoardDTO> searchList=boardRepository.search(searchParam);
        return searchList;
    }

    public void delete(Long id) {
        boardRepository.delete(id);
    }
}
