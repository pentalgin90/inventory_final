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
@Table(name="server")
public class Server extends BaseEntity {
    @Column(name="model")
    private String model;

    @Column(name="inventory_number")
    private String inventoryNumber;

    @Column(name="get_number")
    private String getNumber;

    @Column(name="hdd")
    private int hdd;

    @Column(name="ssd")
    private int ssd;

    @Column(name="cpu_quantity")
    private int cpuQuantity;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="cpu")
    private Cpu cpu;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="ram")
    private Ram ram;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="brand")
    private Brand brand;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="user")
    private User user;
}
