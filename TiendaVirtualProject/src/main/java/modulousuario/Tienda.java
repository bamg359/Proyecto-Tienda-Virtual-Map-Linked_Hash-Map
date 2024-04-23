package modulousuario;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {

    Scanner sc = new Scanner(System.in);

    private int idTienda;

    private int nit;
    private String nombreTienda;

    private String direccion;

    private String telefono;

    private String correo;

    // Constructor

    public Tienda(){


    }


    // Getters and Setters


    public int getIdTienda() {
        return idTienda;
    }

    public void setIdTienda(int idTienda) {
        this.idTienda = idTienda;
    }


    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    Map<String, Map<String, Object>> tiendas = new LinkedHashMap<>();


    // Metodos propios


    public void crearTienda(){



        System.out.println("Crear id tienda: ");
        idTienda = sc.nextInt();
        sc.nextLine();

        Map<String, Object> tienda = new LinkedHashMap<>();


        System.out.println("Ingrese el nit de la empresa: ");
        nit = sc.nextInt();
        sc.nextLine();
        tienda.put("Nit", nit);

        System.out.println("Ingrese el nombre de la tienda: ");
        nombreTienda = sc.nextLine();
        tienda.put("Nombre ", nombreTienda );

        System.out.println("INgrese la direccion de la tienda: ");
        direccion = sc.nextLine();
        tienda.put("Direccion ", direccion);

        System.out.println("Ingrese el telefono de la tienda: ");
        telefono = sc.nextLine();
        tienda.put("Telefono ", telefono);

        System.out.println("Ingrese el correo de la tienda: ");
        correo = sc.nextLine();
        tienda.put("Correo ", correo);

        tiendas.put(idTienda + "", tienda);


    }



    public void verTienda(){

        for ( Map.Entry<String, Map<String, Object>> entrada : tiendas.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }


    }


}
