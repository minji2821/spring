package com.itbank.model;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.itbank.vo.BoardVO;

public interface BoardDAO {

	@Select("select * from board order by idx")
	List<BoardVO> selectAll();

	@Insert("insert into board values(#{idx},#{title},#{contents},#{w_date},#{nick},#{userid})")
	int insert(BoardVO input);

	@Delete("delete from board where idx = #{idx}")
	int delete(int idx);

	@Select("select * from board where idx = #{idx}")
	BoardVO selectone(int idx);
	
	@Update("update board " + 
			"set " + 
			"title=#{title}, " + 
			"contents=#{contents} " +  
			"where idx =#{idx}")
	int update(BoardVO input);
	
	
	
}
