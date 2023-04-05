package com.keyin.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface BookAPIService  extends JpaRepository<Book, Long> {
    public List<Book> findByTitle(@Param("title")String title);
    public List<Book> findByAuthor(@Param("author")String author);

}
