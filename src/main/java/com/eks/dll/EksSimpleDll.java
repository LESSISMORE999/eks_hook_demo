package com.eks.dll;

import com.sun.jna.Library;

public interface EksSimpleDll extends Library {
    void helloWorld();
    int intSquare(int x);
}