package moduloproducto;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Categoria {


    Scanner sc = new Scanner(System.in);


    private int idCategoria;

    private String categoria;

    private String descripcion;

    // Constructor
    public Categoria(){


    }

    // Getters and Setters


    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Estructura de datos

    Map<String, Map<String, Object>> categorias = new LinkedHashMap<>();


    // Metodos propios


    public void crearCategoria(){

        System.out.println("Ingrese el id de la categoria");
        idCategoria= sc.nextInt();
        sc.nextLine();

        Map<String, Object> categoriaProd = new LinkedHashMap<>();

        System.out.println("Ingres el nombre de la categoria: ");
        categoria = sc.nextLine();
        categoriaProd.put("Categoria ", categoria);

        System.out.println("Descripción: ");
        descripcion = sc.nextLine();
        categoriaProd.put("Descripcion ", descripcion);

        categorias.put(idCategoria + "", categoriaProd);

    }

    public void verCategorias(){

        for ( Map.Entry<String, Map<String, Object>> entrada : categorias.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }


    }






}
