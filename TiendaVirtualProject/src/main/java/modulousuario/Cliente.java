package modulousuario;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cliente extends Usuario {


    private int codCliente;
    Date fecha;
    private String direccion;
    private String ciudad;



    public Cliente(){

    }


    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    //Estructura de datos

    public Map<String, Map<String, Object>> usuarios = new LinkedHashMap<>();


    //Metodos


    @Override
    public void crearUsuario() {
        Map<String, Object> usuario = new LinkedHashMap<>();
        super.crearUsuario();
        System.out.println("Agregue el cod del cliente");
        codCliente = sc.nextInt();
        usuario.put("CodClinte", codCliente);

        usuarios.put(getIdUsuario()+"", usuario);
    }

    @Override
    public void verUsuario() {
        super.verUsuario();
    }

    @Override
    public void actualizarUsuario() {

    }

    @Override
    public void eliminarUsuario() {

    }
}
