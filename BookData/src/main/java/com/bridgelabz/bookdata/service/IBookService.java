package com.bridgelabz.bookdata.service;

import com.bridgelabz.bookdata.dto.BookDTO;
import com.bridgelabz.bookdata.entity.BookEntity;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    BookEntity saveData(BookDTO books);

    List<BookEntity> getAllData();

    Optional<BookEntity> getById(int id);

    void deleteData(int id);

    Optional<BookEntity> getBooksByName(String bookName);

    BookEntity editData(BookDTO bookDTO, int id);

    List<BookEntity> getAllDataInDescendingOrder(String field);

    List<BookEntity> getAllDataInAscendingOrder(String field);

    BookEntity editQuantityOfBook(BookDTO bookDTO, String bookName, String authorName);

    BookEntity getDetailsById(int id);
}
