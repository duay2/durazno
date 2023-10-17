/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.durazno.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.durazno.entities.Category;
import mx.itson.durazno.entities.Comments;
import mx.itson.durazno.entities.Post;
import mx.itson.durazno.entities.User;


/**
 *
 * @author aldop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se agregan los usuarios
        User u1 = new User();
        u1.setName("PablitoVlogs");
        u1.setEmail("pablitogamer77@gmail.com");
        u1.setPassword("123321");
        
        User u2 = new User();
        u2.setName("soyPablo");
        u2.setEmail("pablo221@gmail.com");
        u2.setPassword("messi10");
       
        List<User> user = new ArrayList<>();
        user.add(u1);
        user.add(u2);
        
        //Se agregan las categorias
        Category ca1 = new Category();
        ca1.setName("Moda");
        
        Category ca2 = new Category();
        ca2.setName("Entretenimiento");
        
        Category ca3 = new Category();
        ca3.setName("Informatica");
        
        List<Category> category = new ArrayList<>();
        category.add(ca1);
        category.add(ca2);
        category.add(ca3);
        
        //Se agregan los comentarios
        Comments co1 = new Comments();
        co1.setComment("Muy buen articulo amigo.");
        co1.setDate("20 hr. ago");
        co1.setReactionsNeg(0);
        co1.setReactionsPos(24);
        
        List<Comments> comments = new ArrayList<>();
        comments.add(co1);
        
        //Se agregan el post
        Post post = new Post();
        post.setUser(user);
        post.setCategory(category);
        post.setDate("23 hr. ago");
        post.setDescription("Nvidia ha presentado su herramienta GauGAN que, gracias a un modelo de aprendizaje profundo de inteligencia artificial, convierte trazos en imagenes hiperrealistas.\n" + "El sueno de cualquier disenador, o incluso su pesadilla por miedo a que las maquinas le puedan quitar el trabajo. Nvidia ha presentado un innovador programa basado\n" + "en inteligencia artificial que es capaz de generar imagenes hiperralistas a partir de sencillos trazos. Esta novedosa herramienta, basada en redes de confrontacion\n" + "generativas (GAN), ha recibido el nombre de GauGAN en honor al artista post impresionista Paul Gauguin.");
        post.setPicture("https://blogthinkbig.com/wp-content/uploads/sites/4/2019/04/nvidia-foto-realismo-dise%C3%B1o-programa.jpg?resize=1040%2C400");
        post.setTitlePost("Una inteligencia artificial de Nvidia convierte garabatos en imagenes hiperrealistas.");
        post.setReactionsNeg(2);
        post.setReactionsPos(68);
        
        //imprimir
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(user.get(0).getName()+"  "+post.getDate());
        System.out.println("Categoria: "+category.get(2).getName());
        System.out.println(" ");
        System.out.println(post.getTitlePost());
        System.out.println(" ");
        System.out.println(post.getDescription());
        System.out.println(" ");
        System.out.println(post.getPicture());
        System.out.println(" ");
        System.out.println("likes:"+post.getReactionsPos()+"   "+"dislikes:"+post.getReactionsNeg());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("       "+"------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("       "+user.get(1).getName()+"  "+comments.get(0).getDate());
        System.out.println(" ");
        System.out.println("       "+comments.get(0).getComment());
        System.out.println(" ");
        System.out.println("       "+"likes:"+comments.get(0).getReactionsPos()+"   "+"dislikes:"+comments.get(0).getReactionsNeg());
        System.out.println("       "+"------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
}
