import java.util.Properties;

class Test{

    public static void printSystemProperties(){

        System.out.println("Printing System Properties using java program");
        Properties props=System.getProperties();
        System.out.println(props);
    }
    public static void main(String[] args) {
        
        System.out.println("Java Program start...");
        printSystemProperties();

    }
}