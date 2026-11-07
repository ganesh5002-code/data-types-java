class Main2 {
    public static void main(String[] args) {
        int x = 21;
        int y = 76;
        
        System.out.println("Unitary operator" + (x++));
        System.out.println("Unitary operator" + (++y));
        System.out.println("Binary operator");
        System.out.println(" 1 + 2  " +1+2);
        System.out.println(" 1 + 2 " +(1+2));
        System.out.println(1 + 2 +" =3");
        int Increment = x++ * ++y;
        System.out.println(Increment);

        System.out.println("Ternary operator");
        int largestnumber = (y>x)?y:x;
        System.out.println("Largest of two numbers: " + largestnumber);


        }
}