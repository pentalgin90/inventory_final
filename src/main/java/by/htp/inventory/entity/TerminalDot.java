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
@Table(name="terminalDot")
public class TerminalDot extends BaseEntity {
    @Column(name="model")
    private String model;

    @Column(name="inventory_number")
    private String inventoryNumber;

    @Column(name="get_number")
    private String getNumber;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="brand")
    private Brand brand;

    @ElementCollection(fetch=FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name="user")
    private User user;
}
