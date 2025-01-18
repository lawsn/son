package kr.co.suncompany.son.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String birthDt;
    @Column(nullable = true)
    private String phoneNo;
    @Column(nullable = true)
    private String name;
    @Column(nullable = true)
    private String corpName;
    @Column(nullable = true)
    private String regDt;
    @Column(nullable = true)
    private String bizCertificate;
    @Column(nullable = true)
    private String agreeYn;
}