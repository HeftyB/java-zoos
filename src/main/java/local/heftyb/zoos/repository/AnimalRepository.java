package local.heftyb.zoos.repository;

import local.heftyb.zoos.models.Animal;
import local.heftyb.zoos.views.ZooCounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalRepository extends CrudRepository<Animal, Long>
{
    @Query(value = "SELECT DISTINCT a.animaltype, a.animalid, count(za.zooid) as zoocount FROM ANIMALS a LEFT JOIN ZOOANIMALS za ON a.animalid = za.animalid GROUP BY a.animaltype", nativeQuery = true)
    List<ZooCounts> findAllZooCounts();
}

