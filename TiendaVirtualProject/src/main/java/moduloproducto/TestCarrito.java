package moduloproducto;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TestCarrito {
    static Map<String, Object> productos = new LinkedHashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        productos.put("1", new LinkedHashMap<String, Object>() {{
            put("Nombre_Producto", "camisa tipo polo");
            put("Descripción", "camisa");
            put("Precio", 80000.0);
            put("Cantidad", 10.0);
            put("Estado", "DISPONIBLE");
        }});


    }


    public void AgregarProductoCarrito() {

        /*
        System.out.println("Obtener codigo Cliente: ");
        String codCliente = sc.nextLine();
        String idCliente = validarCliente(codCliente);

        String codCliente = "100";

        Map<String, Object> carrito = new LinkedHashMap<>();

        System.out.println("Buscar Producto ");
        String codProd = sc.nextLine();
        String productoAgregar = buscarProductos(codProd).toString();

        Map<String,Object> productoBuscado = productos.get(productoAgregar);

        String productoCarrito = productoBuscado.get("Nombre_producto").toString();

        carrito.put("Producto", productoCarrito);

        System.out.println("Precio");
        //int precio = producto.productos.get(productoAgregar).get("Precio");

        double precio = Double.parseDouble( productoBuscado.get("Precio").toString());

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

            System.out.println("Producto Encontrado : " + productoBuscado.get("Nombre_producto")) ;
            String productoEncontrado = productoBuscado.get("Nombre_peoducto").toString();
            System.out.println("Cantidad Disponible " + productoBuscado.get("Cantidad"));
            System.out.println("Precio" + productoBuscado.get("Precio"));

            return productoEncontrado;

        }else{

            String mensaje = "Producto no encontrado";
            return mensaje;
        }
    }


    public String devolverPrecioProducto(String codigoProducto){

        Map<String,Object> productoBuscado = producto.productos.get(codigoProducto);

        if( productoBuscado != null){


            System.out.println("Precio" + productoBuscado.get("Precio"));
            String productoEncontrado = productoBuscado.get("Precio ").toString();

            return productoEncontrado;

        }else{

            String mensaje = " Precio Producto no encontrado";
            return mensaje;
        }


    }


    public String validarCliente(String codCliente){

        if(cliente.usuarios.containsValue(codCliente) == true){

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
    */

    }
}
