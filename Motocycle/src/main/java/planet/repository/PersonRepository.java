package planet.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import planet.entity.Persoana;

public interface PersonRepository extends PagingAndSortingRepository<Persoana, Integer> {

}