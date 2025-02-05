class Main{
    public static void main(String[] args)
    {
        System.out.println("Whisky");
        Beverage b=new Whisky();
        b.templateMethod(30);
        System.out.println();
        System.out.println("rum");
        b=new Rum();
        b.templateMethod(40);
        System.out.println();
        System.out.println("beer");
        b=new Beer();
        b.templateMethod(300);
    }
}