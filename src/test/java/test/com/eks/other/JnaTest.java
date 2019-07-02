package test.com.eks.other;

import com.eks.dll.EksSimpleDll;
import com.sun.jna.Native;
import org.junit.Test;

public class JnaTest {
    @Test
    public void test1() {
        EksSimpleDll eksSimpleDll = Native.load("eks_c_dll_demo", EksSimpleDll.class);
        eksSimpleDll.helloWorld();
        System.out.println(eksSimpleDll.intSquare(5));
    }
}