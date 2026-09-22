public class Day21 {
    public static void main(String[] args) {
        byte b = Byte.parseByte("10");
        short s = Short.parseShort("100");
        int i = Integer.parseInt("1000");
        long l = Long.parseLong("100000");
        float f = Float.parseFloat("3.14");
        double d = Double.parseDouble("3.14159");
        boolean bool = Boolean.parseBoolean("true");
        char c = "A".charAt(0);

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + bool);
        System.out.println("char: " + c);
    }
}
