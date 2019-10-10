package com.quinnox.java8;
import java.util.*;
import java.io.IOException;
import java.util.Base64;

public class Base64EncodingExample {

	public static void main(String[] args) {
		String orig = "Password123*";

        //encoding  byte array into base 64
        String encoded = Base64.getEncoder().encodeToString(orig.getBytes());     
      
        System.out.println("Original String: " + orig );
        System.out.println("Base64 Encoded String : " + new String(encoded));
      
        //decoding byte array into base64
        byte[] decoded = Base64.getDecoder().decode(encoded);      
        System.out.println("Base 64 Decoded  String : " + new String(decoded));

    }

	}

