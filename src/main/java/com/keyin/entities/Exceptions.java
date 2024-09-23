package com.keyin.entities;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Exceptions {
    static Logger log = Logger.getLogger(Exceptions.class.getName());
    public static void main(String[] args) throws Exception {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[40]);
        } catch (Exception e) {
            throw new Error("Something went wrong");
//            throw new Exception("This dont work fam");
//            log.log(Level.WARNING, e.getMessage());
//            System.out.println("Something Went Wrong. Bug Found!");
//            System.out.println(e.getMessage());

        }
    }
}

