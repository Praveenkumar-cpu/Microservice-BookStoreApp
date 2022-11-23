package com.bridgelabz.bookdata.repo;

import com.bridgelabz.bookdata.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {
    Optional<BookEntity> findBooksByBookName(String bookName);
}
