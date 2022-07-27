package com.its.board;

import com.google.protobuf.RpcUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Homecontoller {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
