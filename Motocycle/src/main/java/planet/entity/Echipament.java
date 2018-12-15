package planet.entity;

import javax.persistence.*;

@Entity
@Table(name = "echipament")
public class Echipament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String denumire;
    private String tip;

    @Override
    public String toString() {
        return "Echipament{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", tip='" + tip + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}
