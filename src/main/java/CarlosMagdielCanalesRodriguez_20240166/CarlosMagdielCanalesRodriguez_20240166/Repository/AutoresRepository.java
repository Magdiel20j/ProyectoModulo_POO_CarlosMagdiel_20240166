package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Repository;


import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity.Autores;
import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoresRepository extends JpaRepository<Libros, Long> {

    static Autores save(Autores autores) {
    }
}
