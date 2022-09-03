package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.domain.Board;
import com.domain.Criteria;
import com.repository.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

	private final BoardMapper mapper;
	
	public ArrayList<Board> boardList(Criteria cri){
		return mapper.boardList(cri);
	}

	public int getTotal(Criteria cri) {
		return mapper.getTotal(cri);
	}
	
	public Board getBoard(int boardIdx) {
		return mapper.getBoard(boardIdx);
	}

}
