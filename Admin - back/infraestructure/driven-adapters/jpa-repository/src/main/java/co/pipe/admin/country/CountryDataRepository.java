package co.pipe.admin.country;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDataRepository extends CrudRepository<CountryData, Long> {
}