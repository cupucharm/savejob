package com.longevity.savejob.domain.posts;

import com.longevity.savejob.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//롬복 어노테이션
@Getter
@NoArgsConstructor
//JPA 어노테이션 Entity - 테이블과 링크될 클래스
@Entity
public class Posts extends BaseTimeEntity { //실제 DB테이블과 매칭

    @Id //해당 테이블의 PK필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //PK생성규칙
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private  String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //게시글 수정
    public void update(String title, String content){
        this.title = title;
        this.content = content;
    }
}
