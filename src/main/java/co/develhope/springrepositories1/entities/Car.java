package co.develhope.springrepositories1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private int serialNumber;

    @Column(nullable = false)
    private double currentPrice;

}