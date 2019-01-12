package com.adpguima.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adpguima.dao.BookDAO;
import com.adpguima.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	@Override
	public long save(Book book) {
		return 0;
	}

	@Override
	public Book get(long id) {
		return null;
	}

	@Override
	@Transactional
	public List<Book> list() {
		return bookDAO.list();
	}

	@Override
	public void update(long id, Book book) {

	}

	@Override
	public void delete(long id) {

	}

}
