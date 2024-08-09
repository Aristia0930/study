package org.example.bbs.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoadrController {

    @GetMapping("")
    public String boardMain(){
        return "board";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }
}
