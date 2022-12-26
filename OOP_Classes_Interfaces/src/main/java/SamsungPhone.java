public class SamsungPhone extends Phone
        implements PhoneConnection, PhoneMedia {

        private int camExtension;
    public SamsungPhone(String name, String model, String OperatingSystem, int RAM, int MainMemory,int camExtension) {
        super(name, model, OperatingSystem, RAM, MainMemory);
            this.camExtension = camExtension;
      }

        @Override
        public void call() {
            System.out.println("Please hold a line...");

        }

        @Override
        public void droppingALine() {
            System.out.println("We are sending your sms, wait please...");
        }

        @Override
        public void takePhoto() {
            System.out.println("Cheeseee,I'm taking a photo of u..");
        }

        @Override
        public void goToGallery() {
            System.out.println("Surfing gallery...");
        }

    @Override  //annotation, to show the same method as in a parent class
    public String toString() {
        return "samsungPhone " +
                "cameraExtension=" + camExtension +'\'' +
                "} " + super.toString();}

        public int getCamExtension() {
            return camExtension;
        }

        public void setCamExtension(int camExtension) {
            this.camExtension = camExtension;
        }





    }


