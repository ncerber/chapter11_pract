public class Main {
    public static void main(String[] args) {
        CheckRegistrationData check1 = new CheckRegistrationData("12112","qwq@sdd.ru");
        try {
            check1.checkData();
            System.out.println("check1: Registaration data is correct");
        } catch (BadEmailException e) {
            e.printStackTrace();
        } catch (BadPasswordException e) {
            System.out.println("check1: "+e.getMessage());
        }

        CheckRegistrationData check2 = new CheckRegistrationData("12112ewewaax","qwq@sdd.ru");
        try {
            check2.checkData();
            System.out.println("check2: Registaration data is correct");
        } catch (BadEmailException e) {
            e.printStackTrace();
        } catch (BadPasswordException e) {
            System.out.println("check3: "+e.getMessage());
        }

        CheckRegistrationData check3 = new CheckRegistrationData("12112ewewSRx","qwq@sdd.ru");
        try {
            check3.checkData();
            System.out.println("check3: Registaration data is correct");
        } catch (BadEmailException e) {
            e.printStackTrace();
        } catch (BadPasswordException e) {
            System.out.println("check3: "+e.getMessage());
        }
    }
}
