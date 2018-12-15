package planet.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import planet.entity.Motor;

public interface PersonAtributeRepository extends PagingAndSortingRepository<Motor, Integer> {

}