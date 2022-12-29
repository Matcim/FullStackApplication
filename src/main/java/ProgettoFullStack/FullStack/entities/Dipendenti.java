package ProgettoFullStack.FullStack.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dipendenti")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dipendenti {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dipendente")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "role")
    private String role;
}
