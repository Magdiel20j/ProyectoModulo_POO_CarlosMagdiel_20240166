package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Service;

import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity.Autores;
import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity.Libros;
import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Repository.AutoresRepository;

import java.util.List;

public class AutoresService {
    private final AutoresRepository autoresRepository;


    public AutoresService(AutoresRepository autoresRepository) {
        this.autoresRepository = autoresRepository;
    }
    public Autores crear(Autores autores){
        return AutoresRepository.save(autores);
    }

    public List<Libros> list(){
        return autoresRepository.findAll();
    }

    public Libros buscar(Long id){
        return autoresRepository.findById(id).orElse(null);
    }

    public Autores actualiza(Long id, Autores autores){
        autores.setId(id);
        return autoresRepository.save(autores);
    }
}
