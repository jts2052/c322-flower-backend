package edu.iu.jts11.flowershopbackend.repository;

import edu.iu.jts11.flowershopbackend.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends CrudRepository<Flower, String> {
}
