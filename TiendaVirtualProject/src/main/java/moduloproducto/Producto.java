package moduloproducto;

import modulousuario.EstadoUsuario;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Producto {

    Scanner sc = new Scanner(System.in);

    private int idProducto;
    private String nombreProducto;

    private String descripcion;

    private double precio;

    private double cantidad;

    Categoria categoria;


    // Constructor

    public Producto(){


    }

    // Getters and Setters


    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    // Estructura de datos

    Map<String, Map<String, Object>> productos = new LinkedHashMap<>();


    // Metodos Propios


    public void crearProducto(){


        System.out.println("Ingrese el codigo de producto: ");
        idProducto = sc.nextInt();
        sc.nextLine();

        Map<String, Object> producto = new LinkedHashMap<>();

        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();
        producto.put("Nombre_Producto", nombreProducto);

        System.out.println("Ingrese la descripcion del producto: ");
        descripcion = sc.nextLine();
        producto.put("Descripción: " , descripcion);

        System.out.println("Ingrese el precio de venta del producto: ");
        precio = sc.nextDouble();
        producto.put("Precio", precio);

        System.out.println("Ingrese la cantidad de producto: ");
        cantidad = sc.nextDouble();
        producto.put("Cantidad", cantidad);

        System.out.println("Seleccione el Estado producto del producto 1. Disponible 2. Agotado 3. Retirado ");
        int select = sc.nextInt();
        String estado = asignarEstadoProducto(select);
        sc.nextLine();
        producto.put("Estado" , estado);



        productos.put(idProducto + "", producto);


    }


    public String asignarEstadoProducto(int select){

        if(select == 1){

            String estado = String.valueOf(EstadoProducto.DISPONIBLE);

            return estado;
        } else if (select == 2) {

            String estado = String.valueOf(EstadoProducto.AGOTADO);

            return estado;
        } else if (select == 3) {
            String estado = String.valueOf(EstadoProducto.RETIRADO);
            return estado;
        } else{
            String mensaje = "Seleccione un estado";
            return mensaje;
        }
    }


    public void verProductos() {

        for ( Map.Entry<String, Map<String, Object>> entrada : productos.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }


}
