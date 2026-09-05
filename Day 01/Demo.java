public class Demo {public static void main(String[] args) {
    
    // Integers --> byte, short, int, long.
    byte b = 5;
    short s = 10;
    int i = 4000;
    long l = 10000;
    
    // Intgers ko hum or bhi number systems me likh sakta hu
    // [1] Binary(2), [2]Octal(8), [3]Hexadecimal(16)--> 0-9,A,B,C,D,E,F

 //Binary me [byte bi = 7;] iske lia hum 7 ko binary me likhege [111] or uske aage 0b lga dega.
    byte bi = 0b111;

    // Octal me [byte ob = 6;] kuki octal ka base 8 ha to 6 range me ha,bs 6 ke aage 0 lgana ha
    byte ob = 06;

    // Hexadecimal number me[byte hb = 12;] kuki hexadecimal ka base 16 ha to 12 range me ha, 
    // bs hum 12 ke aage 0X lagan hoga.
     byte hb = 0Xc;
    // Real numbers --> float, double
    float f = 10.54f;
    double d = 23.0987;

    //Characters--> char
    char c = 'p';
    
    // Boolean --> boolean;
    boolean bool = false;
    
    // string --> string
    String st = "Priyansh";

   

    System.out.println("Integer values -->" + b + "," + s + "," + i + "," + l + "," + bi + "," + ob +  "," + hb);
    System.out.println("Floating values -->" + f + "," + d);
    System.out.println("Character values -->" + c);
    System.out.println("String values -->" + st);
    System.out.println("Boolean values-->" + bool);
    


}
    
}