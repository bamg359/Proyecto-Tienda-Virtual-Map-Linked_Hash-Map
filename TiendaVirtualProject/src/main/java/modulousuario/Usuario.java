package modulousuario;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Usuario implements UtilUsuario{

    Scanner sc = new Scanner(System.in);

    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String correo;
    private String telefono;
    private String contrasena;
    EstadoUsuario estado;
    TipoUsuario tipoUsuario;
    public Tienda store;

    //Estructura de datos


    public Map<String, Map<String, Object>> usuarios = new LinkedHashMap<>();

    //LinkedHashMap usuario = new LinkedHashMap<>();


    //Consructor

    public Usuario(){

    }

    //Getters and Setters

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public EstadoUsuario getEstado() {
        return estado;
    }

    public void setEstado(EstadoUsuario estado) {
        this.estado = estado;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }



    // Metodos propios de la clase implementan de la Interfaz UtilUsuario


    public void crearUsuario(){


        System.out.println("Ingrese el id del usuario: ");
        idUsuario = sc.nextInt();
        sc.nextLine();

        Map<String, Object> usuario = new LinkedHashMap<>();

        System.out.println("Seleccione el tipo de usuario 1. Persona Natural 2. Persona Juridica ");
        int selectTipo = sc.nextInt();
        sc.nextLine();
        String tipo = asignarTipoPersona(selectTipo);
        usuario.put("Tipo de Persona: " , tipo );

        System.out.println("Ingrese el nombre: ");
        nombreUsuario = sc.nextLine();
        usuario.put("Nombre: ", nombreUsuario);

        System.out.println("INgrese el apellido: ");
        apellidoUsuario = sc.nextLine();
        usuario.put("Apellido", apellidoUsuario);

        System.out.println("Ingrese el correo: ");
        correo = sc.nextLine();
        usuario.put("Correo" , correo);

        System.out.println("Ingrese la tienda a la que pertenece el cliente: ");
        String tienda = store.getNombreTienda();
        usuario.put("Tienda ", tienda);

        System.out.println("Ingrese el telefono: ");
        telefono = sc.nextLine();
        usuario.put("Telefono", telefono );


        System.out.println("Ingrese la contraseña: ");
        contrasena = sc.nextLine();
        usuario.put("Contraseña", contrasena);

        System.out.println("Seleccione el estado de usuario 1. Activo 2. Inactivo 3. Bloqueado");
        int selectEstado = sc.nextInt();
        String estadoSeleccionado = asignarEstadoUsuario(selectEstado);
        usuario.put("Estado Cliente", estadoSeleccionado );

        usuarios.put(idUsuario + "", usuario);

    }


    public String asignarTipoPersona(int select){

        if(select == 1){

            String usuario = String.valueOf(TipoUsuario.PERSONA_NATURAL);

            return usuario;
        } else if (select == 2) {

            String usuario = String.valueOf(TipoUsuario.PERSONA_JUDICA);

            return usuario;
        }else{
            String mensaje = "Seleccione un tipo de usuario";
            return mensaje;
        }
    }


    public String asignarEstadoUsuario(int select){

        if(select == 1){

            String estado = String.valueOf(EstadoUsuario.ACTIVO);

            return estado;
        } else if (select == 2) {

            String estado = String.valueOf(EstadoUsuario.INACTIVO);

            return estado;
        }else{
            String mensaje = "Seleccione un estado";
            return mensaje;
        }
    }



    public void verUsuario() {

        for ( Map.Entry<String, Map<String, Object>> entrada : usuarios.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}




