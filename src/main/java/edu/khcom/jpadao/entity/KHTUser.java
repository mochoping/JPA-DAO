package edu.khcom.jpadao.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class KHTUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique=true, nullable=false)
    private String username;

    @Column(unique=false, nullable=false)
    private String password;

    @Column(unique = false, nullable = false)
    private String imagePath;
}
