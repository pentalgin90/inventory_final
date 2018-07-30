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
@Table(name="printer")
public class Printer extends BaseEntity{
    @Column(name="model")
    private String model;

    @Column(name="inventory_number")
    private String inventoryNumber;

    @Column(name="get_number")
    private String getNumber;

    @Column(name="type")
    private String type;

    @Column(name="color_quantity")
    private int colorQuantity;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="brand")
    private Brand brand;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="user")
    private User user;
}
