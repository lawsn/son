package kr.co.suncompany.son.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String email;
    private String address;
    
    public Member(String name, String email) {
        this.name = name;
        this.email = email;
        this.address = address;
    }
}