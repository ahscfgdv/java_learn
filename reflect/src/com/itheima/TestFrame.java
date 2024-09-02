package com.itheima;

import org.junit.Test;

public class TestFrame {

    @Test
    public void test() throws Exception {
        Student s = new Student("liu",12,1.1122);
        ObjectFrame.saveObject(s);
    }

}
