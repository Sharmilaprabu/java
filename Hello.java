
class Hello {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            System.out.println(i);
            if(i%3==0)
            {
                System.out.print(i + " is divisible by 3");
            }
            if(i%5==0)
            {
                System.out.print(i + " is divisible by 5");
            }
        }
    }
}
       