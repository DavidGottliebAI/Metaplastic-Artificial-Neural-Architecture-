package Java.org.network.mana.base_components.sparse;

public final class SrcTarDataPack {

    public final SrcTarPair coo;
    public final double [] values;

    public SrcTarDataPack(SrcTarPair coo, double[] values) {
        this.coo = coo;
        this.values = values;
    }
}
