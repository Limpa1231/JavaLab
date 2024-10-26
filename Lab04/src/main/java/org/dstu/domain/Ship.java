package org.dstu.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.text.DateFormat;
import java.util.Objects;

public class Ship {
    private int id;
    private String name ;
    private String type ;
    private String owner ;
    private String builder ;
    private String flag ;

    @Id
    @GeneratedValue
    @Column(name = "id")
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return id == ship.id && Objects.equals(name,ship.name) && Objects.equals(type, ship.type) && Objects.equals(owner, ship.owner) && Objects.equals(builder, ship.builder) && Objects.equals(flag, ship.flag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, owner, builder, flag);
    }
}
