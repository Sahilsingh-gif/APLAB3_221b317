public class Main {
    public static void main(String[] args) {
        // Create instances of Pandavs, Kauravs, and Vikarn
        Bharatvanshi arjun = new Pandav("Arjun");
        Bharatvanshi bheem = new Pandav("Bheem");
        Bharatvanshi duryodhan = new Kaurav("Duryodhan");

        System.out.println(arjun.fight());    
        System.out.println(arjun.obey());     
        System.out.println(arjun.kind());    
        System.out.println(bheem.fight());  
        System.out.println(bheem.obey());   
        System.out.println(bheem.kind());      
        System.out.println(duryodhan.fight()); 
        System.out.println(duryodhan.obey());  
        System.out.println(duryodhan.kind()); 
    
    }
}