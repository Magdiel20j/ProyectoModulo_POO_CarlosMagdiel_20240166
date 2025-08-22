package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "libros")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Libros {
    @Id
    private Long id;

    @Column(nullable = false, length = 200)
    private String titulo;

    @Column(nullable = false, length = 200, unique = true)
    private String isbn;

    private String añoPublicado;

    @Column(length = 50)
    private String genero;

    @ManyToOne
    @JoinColumn(name = "autores_id")
    private Autores autores;
}
