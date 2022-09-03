package com.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.domain.Board;
import com.domain.Criteria;

@Mapper
public interface BoardMapper {
	public ArrayList<Board> boardList(Criteria cri);
	public int getTotal(Criteria cri);

	public Board getBoard(int boardIdx);

}
