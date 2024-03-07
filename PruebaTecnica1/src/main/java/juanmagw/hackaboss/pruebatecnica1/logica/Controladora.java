package juanmagw.hackaboss.pruebatecnica1.logica;

import java.util.List;
import juanmagw.hackaboss.pruebatecnica1.persistencia.ControladoraPersistencia;
import juanmagw.hackaboss.pruebatecnica1.persistencia.exceptions.EmpleadoDuplicadoException;

public class Controladora {

    ControladoraPersistencia cp = new ControladoraPersistencia();

    public void crearEmpleado(Empleado empleado) throws EmpleadoDuplicadoException {
        cp.crearEmpleado(empleado);
    }

    public List<Empleado> obtenerEmpleados() {
        return cp.obtenerEmpleados();
    }

    public List<Empleado> obtenerEmpleadosNoBorrados() {
        return cp.obtenerEmpleadosNoBorrados();
    }

    public Empleado obtenerEmpleado(Integer id) {
        return cp.obtenerEmpleado(id);
    }

    public void modificarEmpleado(Empleado empleado) throws Exception {
        cp.modificarEmpleado(empleado);
    }

    public void eliminarEmpleado(Integer id) throws Exception {
        cp.eliminarEmpleado(id);
    }

    public List<Empleado> obtenerEmpleadosCargo(String cargo) {
        return cp.obtenerEmpleadosCargo(cargo);
    }
}
