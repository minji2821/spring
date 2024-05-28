package com.itbank.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.service.BoardService;
import com.itbank.vo.BoardVO;

@Controller
public class HomeController {
	
	@Autowired
	private BoardService bs;
	
	
	@GetMapping("/")
	public ModelAndView home() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list",bs.getboards());
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("/board/write")
	public void write() {}
	
	@PostMapping("/board/write")
	public String write(BoardVO input) {
//		System.out.println(input.getTitle());
//		System.out.println(input.getContents());
		
		bs.addboard(input);
		
		return "redirect:/";
	}
	
	@GetMapping("/board/delete")
	public String delete(int idx) {
		bs.delboard(idx);
		
		return "redirect:/";
	}
	
	@GetMapping("/board/update")
	public ModelAndView update(int idx) {
		
		ModelAndView mv = new ModelAndView();
		
		// mv.setViewName();
		//view name을 지정하지 않으면 void와 동일하게 동작
		
		mv.addObject("row",bs.getboardone(idx));
		
		return mv;
	}
	
	@PostMapping("/board/update")
	public String update(BoardVO input) {
		
		bs.updateBoard(input);
		
		return "redirect:/";
	}

}
