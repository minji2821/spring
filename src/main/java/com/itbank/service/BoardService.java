package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDAO;
import com.itbank.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO dao;
	
	public List<BoardVO>getboards() {

		return dao.selectAll();
	}

	public int addboard(BoardVO input) {
		return dao.insert(input);
		
	}

	public int delboard(int idx) {
		return dao.delete(idx);
		
	}

	public BoardVO getboardone(int idx) {
		return dao.selectone(idx);
	}

	public int updateBoard(BoardVO input) {
		return dao.update(input);
	}
	
	

}
