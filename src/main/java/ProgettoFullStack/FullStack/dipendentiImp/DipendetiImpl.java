package ProgettoFullStack.FullStack.dipendentiImp;

import ProgettoFullStack.FullStack.entities.Dipendenti;
import ProgettoFullStack.FullStack.repositories.DipendentiRepository;
import ProgettoFullStack.FullStack.service.DipendentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DipendetiImpl implements DipendentiService {

   @Autowired
   private DipendentiRepository dipendentiRepository;
    @Override
    public ResponseEntity<List<Dipendenti>> readListDipendenti() {
       try {
         return new ResponseEntity<>(dipendentiRepository.findAll(), HttpStatus.OK);
       }catch (Exception e){
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @Override
    public ResponseEntity<Optional<Dipendenti>> readDipendenteId(Long id) {
       try {
           if(dipendentiRepository.existsById(id)){
               return new ResponseEntity<>(dipendentiRepository.findById(id),HttpStatus.ACCEPTED);
           }
           return new ResponseEntity<>(HttpStatus.OK);
       }catch (Exception e){
          return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
       }
    }

    @Override
    public ResponseEntity<Dipendenti> createDipendenti(Dipendenti dipendenti) {
        try {
                return new ResponseEntity<>(dipendentiRepository.save(dipendenti),HttpStatus.CREATED);
        }catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
        }
    }

    @Override
    public ResponseEntity<Dipendenti> updateDipendenti(Long id, Dipendenti dipendenti) {
        try {
             if(dipendentiRepository.existsById(id)){
               return new ResponseEntity<>(dipendentiRepository.saveAndFlush(dipendenti),HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @Override
    public ResponseEntity<Dipendenti> deleteDipendenti(Long id) {
        try {
            if(dipendentiRepository.existsById(id)) {
                dipendentiRepository.deleteById(id);
            }
            return new ResponseEntity<>(HttpStatus.FOUND);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
