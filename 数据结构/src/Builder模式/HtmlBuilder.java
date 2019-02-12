package Builder模式;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder extends Builder {
    private String filename;
    private PrintWriter writer;
    @Override
    public void makeTitle(String titile) {
        filename=titile+".html";
        try {
            writer=new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html  lang=\"en\"><head><meta charset=\"UTF-8\"><title>"+titile+"</title></head><body>");
        writer.println("<h1>"+titile+"</h1>");
    }

    @Override
    public void makeString(String str) {
     writer.println("<p>"+str+"</p>");
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for (int i = 0; i <items.length; i++) {
            writer.println("<li>"+items[i]+"</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void close() {
      writer.println("</body></html>");
      writer.close();
    }
    public String getResult(){
        return filename;
    }
}
