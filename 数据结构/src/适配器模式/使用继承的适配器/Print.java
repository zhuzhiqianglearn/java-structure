package 适配器模式.使用继承的适配器;
//真正的需求 12伏特
public interface Print {
    //弱引用
    public abstract void printWeak();
    //强引用
    public abstract void printStrong();
}
