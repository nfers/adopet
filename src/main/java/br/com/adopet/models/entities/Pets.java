package br.com.adopet.models.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@EqualsAndHashCode(callSuper = false)
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "adopet", name = "pets")
public class Pets extends PanacheEntityBase {

    @Id
    @Column(columnDefinition = "UUID")
    private UUID id;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "type")
    private String type;

    @Column(name = "age")
    private Long age;

    @Column(name = "ethnic_group")
    private String ethnicGroup;

    @Column(name = "race")
    private String race;

    @Column(name = "sex")
    private String sex;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "city")
    private String city;

    @Column(name = "notes")
    private String notes;

}
