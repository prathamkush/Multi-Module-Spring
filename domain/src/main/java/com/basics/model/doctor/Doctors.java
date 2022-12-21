package com.basics.model.doctor;



import javax.persistence.Entity;
import javax.persistence.Id;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
@Entity
public class Doctors {

    @Id
    private int id;
    private String name;
    private String specialist;

    public Doctors(){}

    public Doctors(int id, String name, String specialist) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialist='" + specialist + '\'' +
                '}';
    }
}
