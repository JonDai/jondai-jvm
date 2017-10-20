package cn.jondai.jvm.chapter1;

/**
 * Created by jondai on 2017/10/19.
 */
public class ReferenceCountingGC {

    private Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        ReferenceCountingGC referenceCountingGC_1 = new ReferenceCountingGC();
        ReferenceCountingGC referenceCountingGC_2 = new ReferenceCountingGC();

        referenceCountingGC_1.instance = referenceCountingGC_2;

        referenceCountingGC_2.instance = referenceCountingGC_1;

        referenceCountingGC_1 = null;
        referenceCountingGC_2 = null;

        System.gc();

    }
}
