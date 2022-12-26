public class Main extends Phone
implements PhoneConnection, PhoneMedia {
        private static SamsungPhone samsungPhone;
        private static ApplePhone applePhone;

    public Main () {
    }

    public static void main(String[] args) {
            System.out.println("samsungPhone can operate such functions : \n");
            SamsungPhone samsungPhone = new SamsungPhone("SamsungS7", "light", "Android", 7, 128,9);
            samsungPhone.call();
            samsungPhone.droppingALine();
            samsungPhone.goToGallery();
            samsungPhone.takePhoto();
            System.out.println("samsungPhone can operate such functions : \n");
            System.out.println(samsungPhone);
            System.out.println("applePhone can operate such functions : \n");
            ApplePhone applePhone = new ApplePhone("Apple X", "edger", "IOS", 8, 256);
            applePhone.call();
            applePhone.droppingALine();
            System.out.println(applePhone);
        }


        @Override
        public void call() {

        }

        @Override
        public void droppingALine() {

        }

        @Override
        public void takePhoto() {

        }

        @Override
        public void goToGallery() {

        }
    }


