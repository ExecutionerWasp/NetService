package com.ns.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Alvin
 **/
@Entity
@Document(collection = "usr")
@Data
@NoArgsConstructor
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String userpic;
    private String email;
    private String gender;
    private String locale;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastVisit;
}
