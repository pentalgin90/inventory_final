package by.htp.inventory.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ram")
public class Ram extends BaseEntity {
    @Column(name = "model")
    private String model;
    @Column(name="inventory_number")
    private String inventory_number;
    @Column(name="get_number")
    private String get_number;
    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="brand")
    private Brand brand;
}
