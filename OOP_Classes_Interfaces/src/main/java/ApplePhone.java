public class ApplePhone extends Phone
            implements PhoneConnection {

    public ApplePhone(String name, String model, String OperatingSystem, int RAM, int MainMemory) {
        super(name, model, OperatingSystem, RAM, MainMemory);
    }

        @Override
        public void call() {

        }

        @Override
        public void droppingALine() {

        }

        @Override  //annotation, to show the same method as in a parent class
        public String toString() {
            return "applePhone{" +
                    super.toString();
        }
    }



