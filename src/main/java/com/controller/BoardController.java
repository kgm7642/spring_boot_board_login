package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.Board;
import com.domain.Criteria;
import com.domain.Page;
import com.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

	private final BoardService service;
	
	@GetMapping("/list")
	public String boardList(Model model, Criteria cri) {
		model.addAttribute("boardList", service.boardList(cri));
		model.addAttribute("pageMaker", new Page(service.getTotal(cri), cri));
		return "/board/boardList";
	}
	
	@GetMapping("/view")
	public String boardView(Model model, int boardIdx) {
		model.addAttribute("board",service.getBoard(boardIdx));
		return "/board/boardView";
	}
}
