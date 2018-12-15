package planet.entity;


import javax.persistence.*;

@Entity
@Table(name = "persoana")
public class Persoana {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nume;
    private String nrTelefon;
    private String mail;
    private String username;
    private String password;


    @Override
    public String toString() {
        return "Persoana{" +
                "id=" + id +

                ", Nume='" + nume + '\'' +
                ", prTelefon='" + nrTelefon + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}