package com.uabc.ejercicio.tarea.demo.repository;

import com.uabc.ejercicio.tarea.demo.model.Jabali;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JabaliRepository extends CrudRepository<Jabali, Long> {

    List<Jabali> findByJabaliName(String jabaliName);

    @Query("SELECT a FROM Jabali a WHERE a.jabaliName=:jabali_name")
    List<Jabali> fetchJabalies(@Param("jabali_name") String jabali_name);

}
