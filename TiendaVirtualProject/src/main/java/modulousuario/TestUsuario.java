package modulousuario;

public class TestUsuario {


    public static void main(String[] args) {


        Cliente cliente = new Cliente();

        Tienda tienda = new Tienda();

        cliente.store = tienda;

        tienda.crearTienda();
        tienda.verTienda();
      // cliente.crearUsuario();
       cliente.crearUsuario();

       cliente.verUsuario();


    }

}
