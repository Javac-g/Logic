public class MAin {
        //Integer.toBinaryString
        public static void main(String...args){

            byte a = 64;
            byte b = (byte) ( a << 2);
            System.out.println(b);
            System.out.println(Integer.toBinaryString(a<<2));

        }

}
