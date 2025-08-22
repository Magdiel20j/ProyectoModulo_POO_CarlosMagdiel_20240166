package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Controller;

import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Entity.Libros;
import CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Service.LibrosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibrosController {


        private final LibrosService libroService;



    public LibrosController(LibrosService libroService) {
        this.libroService = libroService;
    }


    @GetMapping
        public List<Libros> listar() {
            return libroService.listar();
        }


        @PostMapping
        public Libros crear(@RequestBody Libros libro) {
            return libroService.crear(libro);
        }


        @GetMapping("/{id}")
        public Libros buscar(@PathVariable Long id) {
            return libroService.buscar(id);
        }


        @PutMapping("/{id}")
        public Libros actualizar(@PathVariable Long id, @RequestBody Libros libro) {
            return libroService.actualizar(id, libro);
        }


        @DeleteMapping("/{id}")
        public void eliminar(@PathVariable Long id) {
            libroService.eliminar(id);
        }
    }

