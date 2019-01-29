package 工厂模式;

public abstract class FactoryM {
    protected abstract Produce createProduce(String ower);
    protected abstract void regiterProduce(Produce p);
    public final Produce create(String ower){
        Produce produce = createProduce(ower);
        regiterProduce(produce);
        return produce;
    }
}
