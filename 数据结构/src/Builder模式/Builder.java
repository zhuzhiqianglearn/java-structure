package Builder模式;

public abstract class Builder {
    public abstract void makeTitle(String titile);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
