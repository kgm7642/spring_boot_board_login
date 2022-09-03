package com.domain;

import lombok.Data;

@Data
public class Board {
	private int boardIdx;
	private String boardName;
	private String boardTitle;
	private String boardContent;
	private String boardDate;
	private int boardHit;
}
