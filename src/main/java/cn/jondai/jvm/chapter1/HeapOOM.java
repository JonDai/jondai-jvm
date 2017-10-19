package cn.jondai.jvm.chapter1;

import java.util.ArrayList;
import java.util.List;

/**
 * test-1-01: Test OutOfMemoryError
 * Java堆溢出
 *
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 *
 * Created by jondai on 2017/10/19.
 */
public class HeapOOM {

    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> objectList = new ArrayList<>();
        while (true){

            objectList.add(new OOMObject());
        }
    }

//    result：
//    java.lang.OutOfMemoryError: Java heap space
//    Dumping heap to java_pid84213.hprof ...
//    Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//    Heap dump file created [27797032 bytes in 0.108 secs]
}
