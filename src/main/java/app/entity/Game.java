package app.entity;

import lombok.*;

import javax.persistence.*;

@Entity(name = "games_table")
@Data
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    private String creationDate;

    public String getName() {
        return name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }


}
