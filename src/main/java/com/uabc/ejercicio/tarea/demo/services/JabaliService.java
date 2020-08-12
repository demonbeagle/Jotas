package com.uabc.ejercicio.tarea.demo.services;

import com.uabc.ejercicio.tarea.demo.model.Jabali;
import com.uabc.ejercicio.tarea.demo.repository.JabaliRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JabaliService {

    @Autowired JabaliRepository jabalirepo;

    //Agregar un jabali
    public void add(Jabali jabali){
        jabalirepo.save(jabali);
    }

    public List<Jabali> todos(String jabali_name){
        return jabalirepo.findByJabaliName(jabali_name);
    }

    //BORRAR POR OBJETO
    public void delete(Jabali jabali){
        jabalirepo.delete(jabali);
    }
    //BORRAR POR ID
    public void deleteId(Long idToDelete){
        jabalirepo.deleteById(idToDelete);
    }
}
