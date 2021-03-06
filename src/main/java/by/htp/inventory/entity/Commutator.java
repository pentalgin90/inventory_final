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
@Table(name="commutator")
public class Commutator extends BaseEntity{
    @Column(name="moddel")
    private String model;
    @Column(name="inventory_number")
    private String iventoryNumber;
    @Column(name="get_number")
    private String getNumber;
    @Column(name="port_quantity")
    private int portQuantity;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="brand")
    private Brand brand;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="user")
    private User user;
}
