package org.iegs.trucks.services.volvo.model.md;

import javax.persistence.*; // для работы с БД
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.Objects;

@Entity
@Table(name = "customer")

public class Customer{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;         // Customer id

    @Column(name = "name")
    private String name;    // Customer name


    public Customer() {}    // конструктор класса без параметров и public - для Java Beans

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return getId() == customer.getId() &&
                Objects.equals(getName(), customer.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}


