package algaworksCRMapi.algaCRM.model;


import jakarta.persistence.*;
import lombok.Data;


@Data //O lombok substitui o uso dos getters and setters e o hashcode e equals
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;


}
