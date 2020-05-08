package nicolini.will.h2dbmanha.controller;


import nicolini.will.h2dbmanha.model.CelphoneEntity;
import nicolini.will.h2dbmanha.repository.CelphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/celphones")
public class CelphoneObject {


    //Mostrar Dados
    @Autowired
private CelphoneRepository celphoneRepository;
    @GetMapping
    public ResponseEntity<List<CelphoneEntity>> findAll (){  // get
        return new ResponseEntity<List<CelphoneEntity>>(
                (List<CelphoneEntity>) this.celphoneRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);//error 404
    }

    //Buscar por ID

    @GetMapping(path = "/{id}")
    // só um objeto
    public ResponseEntity<CelphoneEntity> findById(@PathVariable("id") long id) {
        if (this.celphoneRepository.findById(id).isPresent()) {
            return new ResponseEntity<CelphoneEntity>(
                    this.celphoneRepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);

        }
        return new ResponseEntity<CelphoneEntity>(HttpStatus.NOT_FOUND);
    }


    //Add Dados
    @PostMapping
    public ResponseEntity<CelphoneEntity> register (@RequestBody CelphoneEntity celphoneEntity) {
        return new ResponseEntity<CelphoneEntity> (
                this.celphoneRepository.save(celphoneEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }

//Atualizar

    @PutMapping(value = "/{id}")
    public ResponseEntity<CelphoneEntity> update (@PathVariable("id") long id,
                                                  @RequestBody CelphoneEntity celphoneEntity) throws Exception {

        if(id == 0 || !this.celphoneRepository.existsById(id)){
            throw  new Exception("Código não encontrado ou inexistente!");

        }
        return new ResponseEntity<CelphoneEntity>(
                this.celphoneRepository.save(celphoneEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }

//Deletar

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<CelphoneEntity> delete (@PathVariable("id") long id ){
        this.celphoneRepository.deleteById(id);
        return new ResponseEntity<CelphoneEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}


