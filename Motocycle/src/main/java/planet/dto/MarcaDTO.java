package planet.dto;

public class MarcaDTO {
    private int id;
    private String nume;

    public MarcaDTO(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public MarcaDTO(){}

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
