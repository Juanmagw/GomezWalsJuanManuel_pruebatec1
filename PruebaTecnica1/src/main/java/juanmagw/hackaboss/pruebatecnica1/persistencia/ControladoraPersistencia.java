package juanmagw.hackaboss.pruebatecnica1.persistencia;

import java.util.ArrayList;
import java.util.List;
import juanmagw.hackaboss.pruebatecnica1.logica.Empleado;
import juanmagw.hackaboss.pruebatecnica1.persistencia.exceptions.EmpleadoDuplicadoException;

public class ControladoraPersistencia {

    EmpleadoJpaController ec = new EmpleadoJpaController();

    public void crearEmpleado(Empleado empleado) throws EmpleadoDuplicadoException {
        List<Empleado> empleados = ec.findEmpleadoEntities();
        if (empleados.contains(empleado)) {
            throw new EmpleadoDuplicadoException("El empleado ya existe en la base de datos");
        }
        ec.create(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return ec.findEmpleadoEntities();
    }

    public List<Empleado> obtenerEmpleadosNoBorrados() {
        List<Empleado> empleados = ec.findEmpleadoEntities();
        List<Empleado> empleadosNoBorrados = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (!emp.getBorrado()) {
                empleadosNoBorrados.add(emp);
            }
        }
        return empleadosNoBorrados;
    }

    public Empleado obtenerEmpleado(Integer id) {
        return ec.findEmpleado(id);
    }

    public void modificarEmpleado(Empleado empleado) throws Exception {
        ec.edit(empleado);
    }

    public void eliminarEmpleado(Integer id) throws Exception {
        Empleado empleado = ec.findEmpleado(id);
        empleado.setBorrado(true);
        ec.edit(empleado);
    }

    public List<Empleado> obtenerEmpleadosCargo(String cargo) {
        List<Empleado> empleados = obtenerEmpleadosNoBorrados();
        List<Empleado> empleadosMismoCargo = new ArrayList<>();
        Empleado empleado = new Empleado();
        empleado.setCargo(cargo);
        for (Empleado em : empleados) {
            if (em.getCargo().equalsIgnoreCase(cargo)) {
                empleado = em;
                empleadosMismoCargo.add(empleado);
            }
        }
        return empleadosMismoCargo;
    }
}
