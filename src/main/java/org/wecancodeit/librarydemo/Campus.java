package org.wecancodeit.librarydemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Entity
public class Campus {

    @Id
    @GeneratedValue
    private Long id;
    private String location;
    @OneToMany(mappedBy = "campus")
    private Collection<Book> books;

    public Campus (){}
    public Campus(String location) {
        this.location=location;
    }

    public Long getId() {
        return id;
    }

    public Collection<Book> getBooks() {
        return books;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Campus campus = (Campus) o;
        return Objects.equals(id, campus.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
