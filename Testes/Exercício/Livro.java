package Exercício;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String editora; 


    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setautor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public String getEditora(){
        return this.editora;
    }

}
