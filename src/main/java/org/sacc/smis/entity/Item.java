package org.sacc.smis.entity;

import io.swagger.models.auth.In;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Item {
    /**
     * 自增id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 项目名称对应的表单
     */
    @Column(nullable = false)
    private Integer applicationId;
    /**
     * 填写的项目名称
     */
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer itemTypeId;

    /**
     * 班长给出的tag
     */
    private String monitorTag;

    /**
     * 班长id
     */
    private Integer monitorId;

    /**
     * 辅导员给出的tag
     */
    private String teacherTag;

    /**
     * 辅导员id
     */
    private Integer teacherId;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
