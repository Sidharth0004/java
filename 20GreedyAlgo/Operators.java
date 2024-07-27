public class Operators {
    public static void main(String[] args) {
        int a = 200, b = 50;
        // ! Arithmetic operators
        System.out.println("Addition " + (a + b));
        System.out.println("Subtraction " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // ! Assignment Operators
        int z = 4;
        int var;
        var = z;
        System.out.println("var using =: " + var);
        var += z;
        System.out.println("var using +=: " + var);
        var *= z;
        System.out.println("var using *=: " + var);
        // ! Relational operators
        System.out.println("Greater than: " + (a > b));
        System.out.println("Less than or equal to: " + (a <= b));
        System.out.println("Equal to: " + (a == b));
        System.out.println("Not equal to: " + (a != b));
        // !Logical operators
        boolean x = true, y = false;
        System.out.println("Logical AND: " + (x && y));
        System.out.println("Logical OR: " + (x || y));
        System.out.println("Logical NOT: " + (!x));
        int c = 5, d = 3;
         //! Bitwise operators
        System.out.println("Bitwise AND: " + (c & d));
        System.out.println("Bitwise OR: " + (c | d));
        System.out.println("Bitwise XOR: " + (c ^ d));
        System.out.println("Bitwise NOT: " + (~c));
        int e = 8;
         //! Shift operators
        System.out.println("Left Shift: " + (e << 1));
        System.out.println("Right Shift: " + (e >> 1));
        System.out.println("Unsigned Right Shift: " + (e >>> 1));
    }
}
