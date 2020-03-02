package co.pipe.admin.model.country.gateways;

import co.pipe.admin.model.country.Country;

import java.util.List;

public interface CountryRepository {

    List<Country> findAll();

    Country findById(Long id);

}
