package com.longevity.savejob.domain.posts;

import com.longevity.savejob.domain.posts.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

//DB Layer 접근자 - JPA에서는 Repository.
//인터페이스 생성 후, JpaRepository<Entity 클래스, PK타입>을 상속하면
//기본적인 CRUD 메소드 자동으로 생성.
//Entity 클래스와 기본 Entity Repository는 함께 위치해야 함.
public interface PostsRepository extends JpaRepository<Posts,Long>{

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
