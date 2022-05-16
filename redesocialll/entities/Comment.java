package entities;

public class Comment {
    //ATRIBUTOS
    private String text;
    //construtor vazio pois posso chamar o obj em outra classe sem parametro
    public Comment(){
    }
    public Comment(String text){
        this.text = text;
    }

    //gets e sets
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}
