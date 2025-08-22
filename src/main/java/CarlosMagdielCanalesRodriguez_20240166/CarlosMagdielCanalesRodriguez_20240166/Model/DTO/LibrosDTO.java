package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Model.DTO;

import jakarta.persistence.Entity;

import java.util.Date;

public class LibrosDTO {


    @Entity
    public class AutoresDTO {

        private Number Id;
        private String titulo;
        private String isbn;
        private Date año_publicacion;
        private String genero;
        private Number autor_id;
    }




}
