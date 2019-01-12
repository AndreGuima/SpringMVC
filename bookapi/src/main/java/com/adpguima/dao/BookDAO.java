package com.adpguima.dao;

import java.util.List;

import com.adpguima.model.Book;

public interface BookDAO {

	long save(Book book);

	Book get(long id);

	List<Book> list();

	void update(long id, Book book);

	void delete(long id);
}
