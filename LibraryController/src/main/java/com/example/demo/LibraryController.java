package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class LibraryController {
	
	@Autowired
	BookDAO1 bookDAO;
	
	@RequestMapping("show")
	public ModelAndView getBook() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("Bookstore.jsp");
		return mv;
	}
	
	@RequestMapping("ArrivalBooks")
	public ModelAndView addBooks(Book1 bo) {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("BookDetails",bo);
		mv.setViewName("Arrival.jsp");
		
		bookDAO.save(bo);
		return mv;
	}
	
	@RequestMapping("ViewedBooks")
	public ModelAndView viewBooks(Book1 boo) {
		ModelAndView mv = new ModelAndView();
		
		Optional<Book1> op = bookDAO.findById(boo.getId());
		Book1 book = op.get();
		mv.addObject("BookDetails",boo);
		mv.setViewName("ViewBooks.jsp");
		return mv;
	}
	
	@RequestMapping("DeleteBooks")
	public ModelAndView deleteBooks(Book1 bk) {
		ModelAndView mv = new ModelAndView();
		
		bookDAO.deleteById(bk.getId());
		
		mv.addObject("BookDetails",bk);
		mv.setViewName("DeletedBooks.jsp");
		return mv;
	}
	
	@RequestMapping("UpdateBooks")
	public ModelAndView updateBooks(Book1 bs) {
		ModelAndView mv = new ModelAndView();
		
		bookDAO.deleteById(bs.getId());
		
		mv.addObject("BookDetails",bs);
		mv.setViewName("UpdatedBooks.jsp");
		return mv;
	}

}