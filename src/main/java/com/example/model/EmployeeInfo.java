package com.example.model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="EmployeeInfo")
public class EmployeeInfo
{

    @Id
    @Column(name="EmployeeId")
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="FirstName")
    @Getter
    @Setter
    private String FirstName;

    @Column(name="LastName")
    @Getter
    @Setter
    private String LastName;

    @Column(name="Position")
    private String Position;

    @Column(name="Office")
    @Getter
    @Setter
    private String Office;

    public EmployeeInfo() {
    }
    public EmployeeInfo( String firstName, String lastName, String position, String office) {
        FirstName = firstName;
        LastName = lastName;
        Position = position;
        Office = office;
    }


}