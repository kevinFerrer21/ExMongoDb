package it.develhope.ExMongoDb.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class User {
    @Id
    
    private String id;
    private String firstname;
    private String lastname;
}
