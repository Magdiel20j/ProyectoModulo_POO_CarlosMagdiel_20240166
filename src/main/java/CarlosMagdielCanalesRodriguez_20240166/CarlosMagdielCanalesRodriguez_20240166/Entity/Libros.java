package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity;

import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Repository.LibrosRepository;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Entity
@Table(name = "libros")
@Getter @Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Service
public class Libros {





        private LibrosRepository libroRepository;

        public void LibroService(LibrosRepository libroRepository) {
            this.libroRepository = libroRepository;
        }


        public Libros crear(Libros libro) {
            return libroRepository.save(libro);
        }

        public List<Libros> listar() {
            return libroRepository.findAll();
        }


        public Libros buscar(Long id) {
            return libroRepository.findById(id).orElse(null);
        }


        public Libros actualizar(Long id, Libros libro) {
            libro.setId(id);
            return libroRepository.save(libro);
        }

    private void setId(Long id) {
    }


    public void eliminar(Long id) {
            libroRepository.deleteById(id);
        }
    }

