package moduloproducto;

import modulousuario.Cliente;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CarritoCompra {


    Scanner sc = new Scanner(System.in);

    private int idTransaccion;

    Producto producto;

    private int cantidad;

    private double precio;

    private double totalCarrito;

    EstadoCarro estado;

    Cliente cliente;



    // Constructor

    public CarritoCompra(){


    }


    // Getters and Setters


    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotalCarrito() {
        return totalCarrito;
    }

    public void setTotalCarrito(double totalCarrito) {
        this.totalCarrito = totalCarrito;
    }

    public EstadoCarro getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarro estado) {
        this.estado = estado;
    }

    // Estructuras de datos

    Map<String, Map<String, Object>> productosCarrito = new LinkedHashMap<>();

    // Metodos propios


    public void AgregarProductoCarrito(){


        System.out.println("Obtener codigo Cliente: ");
        String codCliente = sc.nextLine();
        String idCliente = validarCliente(codCliente);
        System.out.println(idCliente);

        Map<String, Object> carrito = new LinkedHashMap<>();

        System.out.println("Buscar Producto ");
        String codProd = sc.nextLine();
        String productoAgregar = buscarProductos(codProd);

        carrito.put("Producto",productoAgregar);

        System.out.println("Debugging" + productoAgregar);

        //Map<String,Object> productoBuscado = producto.productos.get(codProd);

        //String productoCarrito = productoBuscado.get("Nombre_producto").toString();

        String precioAgregar = buscarProductosPrecio(codProd);

        //carrito.put("Precio", precioAgregar);

        System.out.println("Precio" + precioAgregar);
        //int precio = producto.productos.get(productoAgregar).get("Precio");

        double precio = Double.parseDouble( precioAgregar);

        carrito.put("Precio", precio);


        System.out.println("Agregue la cantidad");
        int cantidad = sc.nextInt();
        carrito.put("Cantidad", cantidad);


        double total  = precio*cantidad;
        carrito.put("Total", total);


        productosCarrito.put(idCliente, carrito);

    }


    public String  buscarProductos(String prod){

        producto.verProductos();
        System.out.println("Ingrese el codigo del producto a seleccionar");
        String codigoProducto = sc.nextLine();

        Map<String,Object> productoBuscado = producto.productos.get(codigoProducto);

        if( productoBuscado != null){

            System.out.println("Producto disponible");

            System.out.println("Producto Encontrado : " + productoBuscado.get("Nombre_Producto")) ;
            String productoEncontrado = productoBuscado.get("Nombre_Producto").toString();
            System.out.println("Cantidad Disponible " + productoBuscado.get("Cantidad"));
            System.out.println("Precio" + productoBuscado.get("Precio"));

            return productoEncontrado;

        }else{

            String mensaje = "Producto no encontrado";
            return mensaje;
        }
    }

    public String  buscarProductosPrecio(String prod){

        //producto.verProductos();
        //System.out.println("Ingrese el codigo del producto a seleccionar");
        //String codigoProducto = sc.nextLine();

        Map<String,Object> productoBuscado = producto.productos.get(prod);

        if( productoBuscado != null){

            System.out.println("Producto disponible");

            System.out.println("Producto Encontrado : " + productoBuscado.get("Nombre_Producto")) ;
            //String productoEncontrado = productoBuscado.get("Nombre_Producto").toString();
            System.out.println("Cantidad Disponible " + productoBuscado.get("Cantidad"));
            System.out.println("Precio" + productoBuscado.get("Precio"));
            String precioEncontrado = productoBuscado.get("Precio").toString();

            return precioEncontrado;

        }else{

            String mensaje = "Producto no encontrado";
            return mensaje;
        }
    }



    public String devolverPrecioProducto(String codigoProducto){

        Map<String,Object> productoBuscado = producto.productos.get(codigoProducto);

        if( productoBuscado != null){


            System.out.println("Precio" + productoBuscado.get("Precio"));
            String productoEncontrado = productoBuscado.get("Precio").toString();

            return productoEncontrado;

        }else{

            String mensaje = " Precio Producto no encontrado";
            return mensaje;
        }


    }


    public String validarCliente(String codCliente){

        cliente.verUsuario();

        Map<String,Object> clienteBuscado = cliente.usuarios.get(codCliente);


        if(clienteBuscado != null){

            System.out.println("Cliente existe");

            return codCliente;


        }else{

            String mensaje = "Cliente no existe";
            return mensaje;
        }


    }


    public void verProductosCarrito() {

        for ( Map.Entry<String, Map<String, Object>> entrada : productosCarrito.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }








}
