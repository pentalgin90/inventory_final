package by.htp.inventory.entity;

import lombok.*;
import org.hibernate.annotations.Proxy;

import javax.persistence.*;
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="monitor")
@Proxy(lazy = false)
public class Monitor extends BaseEntity {

@Column(name="model")
private String model;

@Column(name="inventary_name")
private String inventaryId;

@Column(name="get_number")
private String getNumber;

@ElementCollection(fetch=FetchType.LAZY)
@ManyToOne
@JoinColumn(name="diagonal")
private Diagonal diagonal;

@ElementCollection(fetch=FetchType.LAZY)
@ManyToOne
@JoinColumn(name="brand")
private Brand brand;

@ElementCollection(fetch=FetchType.LAZY)
@ManyToOne
@JoinColumn(name="user")
private User user;
}
