package planet.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import planet.entity.Marca;
import planet.entity.Motor;

public interface MarcaRepository extends PagingAndSortingRepository<Marca, Integer> {

}