package org.dstu.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
public class Chair {
    private int id;
    private String name;
    private boolean graduating;
    private Set<Teacher> staff = new LinkedHashSet<>();

    @Basic
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "graduating")
    public boolean isGraduating() {
        return graduating;
    }

    public void setGraduating(boolean graduating) {
        this.graduating = graduating;
    }

    @OneToMany(mappedBy = "chair")
    public Set<Teacher> getStaff() {
        return staff;
    }

    public void setStaff(Set<Teacher> staff) {
        this.staff = staff;
    }
}
