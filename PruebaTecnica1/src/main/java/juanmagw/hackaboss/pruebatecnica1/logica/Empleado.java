package juanmagw.hackaboss.pruebatecnica1.logica;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import juanmagw.hackaboss.pruebatecnica1.persistencia.exceptions.EmpleadoInvalidoException;

@Entity
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String cargo;
    private Double salario;
    private LocalDate fechaInicio;
    private Boolean borrado;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apellido, String cargo, Double salario, LocalDate fechaInicio) throws EmpleadoInvalidoException {
        if (nombre == null || nombre.equals("")){
            throw new EmpleadoInvalidoException("El nombre del empleado no puede ser null o estar vacío");
        } else if(apellido == null || apellido.equals("")){
            throw new EmpleadoInvalidoException("El apellido del empleado no puede ser null o estar vacío");
        } else if(cargo == null || cargo.equals("")){
            throw new EmpleadoInvalidoException("El cargo del empleado no puede ser null o estar vacío");
        } else if(salario == null || salario < 0){
            throw new EmpleadoInvalidoException("El salario del empleado no puede ser null o menor a 0");
        } else if(fechaInicio == null){
            throw new EmpleadoInvalidoException("La fecha de inicio del empleado no puede ser null");
        }
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.borrado = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Boolean getBorrado() {
        return borrado;
    }

    public void setBorrado(Boolean borrado) {
        this.borrado = borrado;
    }

    @Override
    public String toString() {
        return "El empleado se llama " + this.nombre + " " + this.apellido + ", su cargo es " + this.cargo + " donde su salario consta como " + this.salario + " €/mes y comenzó en la empresa en " + this.fechaInicio;
    }
}
