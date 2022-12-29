package ProgettoFullStack.FullStack.controller;

import ProgettoFullStack.FullStack.entities.Dipendenti;
import ProgettoFullStack.FullStack.service.DipendentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController()
public class DipendentiController {

    @Autowired
 private   DipendentiService dipendentiService;


    @GetMapping("/dipendenti")
    public ResponseEntity<List<Dipendenti>> listaDipendenti(){
        return dipendentiService.readListDipendenti();
    }

    @GetMapping("/dipendenti/{id}")
    public ResponseEntity<Optional<Dipendenti>> idDipendenti(@PathVariable Long id){
        return dipendentiService.readDipendenteId(id);
    }

    @PostMapping("/dipendenti")
    public ResponseEntity<Dipendenti> createDipendenti(@RequestBody Dipendenti dipendenti){
       return dipendentiService.createDipendenti(dipendenti);
    }

    @PutMapping("/dipendenti/{id}")
    public ResponseEntity<Dipendenti> updateDipendenti(@PathVariable Long id,@RequestBody Dipendenti dipendenti){
        return dipendentiService.updateDipendenti(id,dipendenti);
    }

    @DeleteMapping("/dipendenti/{id}")
    public ResponseEntity<Dipendenti> deleteIdDipendenti(@PathVariable Long id){
        return dipendentiService.deleteDipendenti(id);
    }
}
