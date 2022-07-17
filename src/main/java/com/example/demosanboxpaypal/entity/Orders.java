package com.example.demosanboxpaypal.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Orders {
    @Id
    @SequenceGenerator(
            name = "order_sequence",
            sequenceName = "order_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_sequence"
    )
    private Long id;
    private String phone;
    private String name;
    private String gender;
    private String address;
    private double total;
    private String state;
    private String payments;
    private Date createdAt;
    private Date modifiedAt;

}
