import java.lang.reflect.*;

public class LaunchingCat extends Cat{

    public LaunchingCat(int YearsOfLife) {
        super ();
    }

    public static void main(String[] args) {
                try {
            Cat cat1 = new Cat ();// create an object of Cat class
            Class obj = cat1.getClass ();  // get Class object using getClass()
            Field cat_field = obj.getField ( "CatName" );
            System.out.println ( "Details of Cat class field:" );
            cat_field.set ( cat1, "Murka" ); // set the value of field

                Field field2 = obj.getDeclaredField("AverageWeight");
                field2.setAccessible(true);
                field2.set(cat1, "5");
                System.out.println("Field Information of AverageWeight of Cat:");
                int mod2 = field2.getModifiers();
                String modifier2 = Modifier.toString(mod2);
                System.out.println("Cat modifier is : " + modifier2);
                // get the value of rollNo converting in String
                String CatValue = (String)field2.get(cat1);
                System.out.println("Cat weights on average : " + CatValue +" kg");

                int mod1 = cat_field.getModifiers ();
                String modifier1 = Modifier.toString ( mod1 );
                System.out.println ( "\nCatName modifier is: " + modifier1 );
                String typeValue = (String) cat_field.get ( cat1 );
                System.out.println ( "CatName is: " + typeValue );
                Method[] methods = obj.getDeclaredMethods ();
                for(Method m : methods) {
                    System.out.println ( "\nMethod Name: " + m.getName () + " -> [Mau,I'm sipping milk]" );
                    int modifier = m.getModifiers ();
                    System.out.print ( "Modifier: " + Modifier.toString ( modifier ) + "  \n" );

                    // get the return type of method
                    System.out.print ( "Return Type: " + m.getReturnType () );
                    System.out.println ( "\n" );
                }
                } catch (Exception e) {
                    e.printStackTrace ();
                }
    }
}


