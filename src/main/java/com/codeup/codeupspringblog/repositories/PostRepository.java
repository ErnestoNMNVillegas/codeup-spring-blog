package com.codeup.codeupspringblog.repositories;

import com.codeup.codeupspringblog.models.Post;
import org.hibernate.annotations.SQLInsert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
//    Post findAdByTitle(String title);
//    Post findAdById(long id);
    @Query("from Post p where p.title like %:term%")
    List<Post> searchByTitleLike(@Param("term") String term);

    Post findPostById(long id);


//    @Override
//    <S extends Post> S save(S entity);
}
