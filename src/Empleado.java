public class Empleado {
    private String cargo;
    private Departamento departamento;
    private double sueldo;

    public Empleado(String cargo, Departamento departamento, double sueldo) {
        this.cargo = cargo;
        this.departamento = departamento;
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "cargo='" + cargo + '\'' +
                ", departamento=" + departamento +
                ", sueldo=" + sueldo +
                '}';
    }
}
