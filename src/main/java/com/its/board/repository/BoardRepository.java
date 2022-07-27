package com.its.board.repository;

import com.its.board.dto.BoardDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BoardRepository {
    @Autowired
    SqlSessionTemplate sql;
    public int save(BoardDTO boardDTO) {
        return sql.insert("Board.save",boardDTO);
    }

    public List<BoardDTO> findAll() {
        return sql.selectList("Board.findAll");
    }

    public BoardDTO detail(Long id) {
        sql.update("Board.updateHits",id);
        return sql.selectOne("Board.detail",id);
    }
    public int boardCount()
    {
        return sql.selectOne("Board.count");
    }

    public List<BoardDTO> pagingList(Map<String, Integer> pagingParam) {
        return sql.selectList("Board.pagingList", pagingParam);
    }

    public List<BoardDTO> search(Map<String, String> searchParam) {
        return sql.selectList("Board.search",searchParam);
    }

    public void delete(Long id) {
        sql.delete("Board.delete",id);
    }
}
