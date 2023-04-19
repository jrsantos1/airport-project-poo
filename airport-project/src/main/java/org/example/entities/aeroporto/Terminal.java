package org.example.entities.aeroporto;

import java.util.Objects;

public class Terminal {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Terminal terminal)) return false;
        return Objects.equals(id, terminal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
