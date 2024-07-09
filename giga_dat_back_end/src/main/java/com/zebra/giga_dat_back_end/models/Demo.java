package com.zebra.giga_dat_back_end.models;

import lombok.*;
import javax.persistence.*;

@Table(name = "demo")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(name = "demo_sequence", sequenceName = "demo_sequence", allocationSize = 1)
public class Demo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "demo_sequence")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
}
