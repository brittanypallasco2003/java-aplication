package modelo;

public class Estudiante {
    private String codigo;
    private String cedula;
    private String nombre;
    private String FechaNac;
    private String signo;

    public Estudiante(String codigo, String cedula, String nombre, String fechaNac, String signo) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.nombre = nombre;
        FechaNac = fechaNac;
        this.signo = signo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String fechaNac) {
        FechaNac = fechaNac;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
}
