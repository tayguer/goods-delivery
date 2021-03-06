package br.com.goods.delivery.domain.repository;

import java.util.Set;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

import br.com.goods.delivery.domain.model.City;

/**
 * {@link City} entity repository
 * 
 * @author Tayguer A. Ap. Onofre
 * @version 1.0
 *
 */
@Repository
public interface CityRepository extends GraphRepository<City> {
	
	public City findByMapNameAndName(String mapName, String name);
	public City findById(Long id);
	public Set<City> findByName(String name);
	public Set<City> findByMapName(String mapName);
}