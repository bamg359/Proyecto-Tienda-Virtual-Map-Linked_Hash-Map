package moduloproducto;

import modulousuario.Cliente;
import modulousuario.Tienda;

public class TestProducto {


    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Tienda tienda = new Tienda();

        cliente.store = tienda;

        tienda.crearTienda();

        tienda.verTienda();
        // cliente.crearUsuario();
        cliente.crearUsuario();

        cliente.verUsuario();


        Categoria categoria = new Categoria();

        Producto producto = new Producto();

        CarritoCompra carritoCompra = new CarritoCompra();

        producto.categoria = categoria;

        carritoCompra.producto = producto;

        carritoCompra.cliente = cliente;

        categoria.crearCategoria();

        categoria.verCategorias();

        producto.crearProducto();

        producto.verProductos();

        carritoCompra.AgregarProductoCarrito();

        carritoCompra.verProductosCarrito();



    }
}
