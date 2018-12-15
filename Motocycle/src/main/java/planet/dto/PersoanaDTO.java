package planet.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PersoanaDTO {

    private Integer id;
    private String nume;
    private String nrTelefon;
    private String mail;
    private String username;
    private String password;

    public PersoanaDTO(Integer id, String nume, String nrTelefon, String mail, String username, String password) {
        this.id = id;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
        this.username = username;
        this.password = password;
    }

    public PersoanaDTO(){}

    public Integer getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getMail() {
        return mail;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
