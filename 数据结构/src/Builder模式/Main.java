package Builder模式;

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder= new TextBuilder();
        HtmlBuilder htmlBuilder=new HtmlBuilder();
        Director director=new Director(textBuilder);
        director.construct();
        System.out.println(textBuilder.getResult());
        director=new Director(new HtmlBuilder());
        director.construct();
        System.out.println(htmlBuilder.getResult());
    }
}
