package com.its.board.controller;

import com.its.board.dto.BoardDTO;
import com.its.board.dto.PageDTO;
import com.its.board.service.BoardServices;
import com.its.board.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class BoardController {
    @Autowired
    private CommentService commentService;

    @Autowired
    BoardServices boardServices;
    @GetMapping("/save-form")
    public String saveForm(){

        return "save";
    }
    @GetMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        boolean a =boardServices.save(boardDTO);
        if(a){
            return "redirect:findAll";
        }else {
            return "save-fall";
        }

    }
    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<BoardDTO> b = boardServices.findAll();
        model.addAttribute("board", b);
        return "list";
    }
    @GetMapping("/detail")
    public String detail(@RequestParam("id")Long id, Model model,@RequestParam(value = "page", required = false, defaultValue = "1") int page){
       BoardDTO a= boardServices.detail(id);
       model.addAttribute("board",a);
       model.addAttribute("page" ,page);
       //댓글 목록
   // List<CommentDTO> commentDTOList=commentService.findAll(id);
       return "detail";
    }
    @GetMapping("/count")
    public String count(@RequestParam("id")Long id ,Model model){

            model.addAttribute("board",boardServices.detail(id));
            return "update";

    }
    @GetMapping("/pawCheck")
    public String pawCheck(@RequestParam("id")Long id ,Model model){

    model.addAttribute("board",boardServices.detail(id));
     return "pawCheck";
  }
  @GetMapping("/update")
  public String update(@RequestParam("id")Long id){
        return "shadow";

  }

    @GetMapping("/delete")
    public String delete(@RequestParam("id")Long id){
     boardServices.delete(id);
    return "redirect:findAll";
    }
    @GetMapping("/paging")
    // /board/paging?page=1
    //required=false로 하면 /board/paging 요청도 가능
    //별도의 페이지 값을 요청 하지 않으며 첫페이지 (page=1)
    public String paging(@RequestParam(value="page", required=false, defaultValue="1") int page, Model model) {
        List<BoardDTO> boardList = boardServices.pagingList(page);
        PageDTO paging = boardServices.paging(page);
        model.addAttribute("boardList", boardList);
        model.addAttribute("paging", paging);
        return "pagingList";
    }
    //검색 처리
    @GetMapping("/search")
    public String search(@RequestParam("searchType")String searchType, @RequestParam("q") String q ,Model model){
        List<BoardDTO> s = boardServices.search(searchType,q);
        model.addAttribute("boardList ",s);
        return "list";

    }

}
