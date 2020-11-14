package by.grodno.pvt.site.webappsample.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    private String firstName;
    private String lastName;
    private Date birthdate;

    @Column(name = "isMale")
    private boolean male;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department ownerDepartment;

}
