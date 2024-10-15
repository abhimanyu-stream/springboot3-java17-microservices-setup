package com.stream.comment.feedback.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;


@Builder
@NoArgsConstructor
@Accessors(chain = true)
@AllArgsConstructor
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "post")
public class Post extends AuditorEntity implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = -998011031181528741L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title", nullable = false, length = 500)
    private String title;

    @Column(name = "body", nullable = true, length = 5000)
    private String body;

    @Column(name = "path", nullable = true, length = 500)
    private String path;






    public Post(String title, String body, String path) {
        super();
        this.title = title;
        this.body = body;
        this.path = path;

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
