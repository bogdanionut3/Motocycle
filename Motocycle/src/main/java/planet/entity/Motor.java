package planet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "motor")
public class Motor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    //private List<Marca> marci;
    //private List<Tip> tipuri;

    @Override
    public String toString() {
        return "Motor{" +
                "id=" + id +
              //  ", marci=" + marci +
              //  ", tipuri=" + tipuri +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

  // public List<Marca> getMarci() {
        //return marci;
   // }

   // public void setMarci(List<Marca> marci) {
       // this.marci = marci;
  //  }

   // public List<Tip> getTipuri() {
       // return tipuri;
   // }

   // public void setTipuri(List<Tip> tipuri) {
     //   this.tipuri = tipuri;
    //}
}
