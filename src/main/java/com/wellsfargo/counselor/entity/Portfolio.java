package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

//    @Column(nullable = false)
//    private LocalDate creationDate;

    @OneToOne
    @JoinColumn(name = "clientId", nullable = false)
    private Client client;
}
