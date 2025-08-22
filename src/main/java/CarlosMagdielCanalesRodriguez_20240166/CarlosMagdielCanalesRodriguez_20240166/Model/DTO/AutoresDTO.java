package CarlosMagdielCanalesRodriguez_20240166.CarlosMagdielCanalesRodriguez_20240166.Model.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class AutoresDTO {

    private Number Id;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fecha_nacimiento;
}
