package planet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import planet.dto.MarcaDTO;
import planet.entity.Marca;
import planet.repository.MarcaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    @Autowired
    private MarcaRepository marcaRepository;


    public MarcaDTO saveMarca(MarcaDTO marcaDTO) {
        Marca marca = new Marca();
        marca.setNume(marcaDTO.getNume());

        Marca save = marcaRepository.save(marca);
        return new MarcaDTO(save.getId(), save.getNume());
    }

    public List<MarcaDTO> findAllMarcs() {
        Iterable<Marca> all = marcaRepository.findAll();
        List<MarcaDTO> marcaDTOS = new ArrayList<>();

        for (Marca p : all) {
            marcaDTOS.add(new MarcaDTO(
                    p.getId(), p.getNume()));
        }

        return marcaDTOS;
    }

    public MarcaDTO getMarcaById(Integer id) {
        Optional<Marca> marcaOptional = marcaRepository.findById(id);
        if (marcaOptional.isPresent()) {
            Marca marca = marcaOptional.get();


            return new MarcaDTO(
                    marca.getId(), marca.getNume());
        }

        return null;
    }

    public boolean deleteMarca(Integer id) {
        boolean marcaExists = marcaRepository.existsById(id);
        if (marcaExists) {
            marcaRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
