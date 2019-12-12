package com.zeroten.flow;

import org.testng.annotations.Test;
import java.lang.StringBuffer;
import java.util.Arrays;


public class IfElseTest {

    @Test
    public void testIfElse() {
        Integer[] arr = {1,2,3,4,5};
        for (int val1 : arr){
            System.out.println(val1);
        }
        Arrays.asList(arr).forEach(val -> System.out.println(val));
    }


}
