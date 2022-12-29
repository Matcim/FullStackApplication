package ProgettoFullStack.FullStack.service;

import ProgettoFullStack.FullStack.dipendentiImp.DipendetiImpl;
import ProgettoFullStack.FullStack.entities.Dipendenti;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface DipendentiService {



     ResponseEntity<List<Dipendenti>> readListDipendenti();

     ResponseEntity<Optional<Dipendenti>> readDipendenteId(Long id);

     ResponseEntity<Dipendenti> createDipendenti(Dipendenti dipendenti);


     ResponseEntity<Dipendenti> updateDipendenti(Long id,Dipendenti dipendenti);


     ResponseEntity<Dipendenti> deleteDipendenti(Long id);



}
