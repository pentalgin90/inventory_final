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
@Table(name="monitor")
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
