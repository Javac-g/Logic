public class MAin {
        //Integer.toBinaryString
        public static void main(String...args){

            int a = 42;
            int b = 00000001;
            int c =  (a | b);
            System.out.println(Integer.toBinaryString(a));
            System.out.println(Integer.toBinaryString(b));
            System.out.println(Integer.toBinaryString(c));
        }

}
