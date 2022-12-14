package com.longevity.savejob.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity { //JPA Auditing으로 데이터의 생성시간, 수정시간 자동화

    //생성시간
    @CreatedDate
    private LocalDateTime createdDate;
    
    //수정시간
    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
