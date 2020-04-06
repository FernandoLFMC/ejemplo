package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Incremen;

@Repository
public interface IncremenRepository extends JpaRepository<Incremen, Long> {

}
