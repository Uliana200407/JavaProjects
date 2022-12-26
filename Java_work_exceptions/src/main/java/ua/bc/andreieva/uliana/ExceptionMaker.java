package ua.bc.andreieva.uliana;
public class ExceptionMaker {

    public static void main(String[] args) throws SaferException {
        new ExceptionMaker().isThereTwo(getData());

    }

    public boolean isThereTwo(Object[] objectsArray) throws SaferException{
        for (Object someObject : objectsArray) {
        try {
            if (someObject.equals ( 2 )) {
                return true;
            }
        }catch(Exception NullPointerException){
            throw new SaferException("Error: NullPointerException");
             }
        }
        return false;
    }

    public static Object[] getData() {
        return new Object[] { new Object(), null, "test data", 2 };
    }
}





