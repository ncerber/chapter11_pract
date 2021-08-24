public class CheckRegistrationData {
    private String password;
    private String eMail;

    public CheckRegistrationData(String password, String eMail) {
        this.password = password;
        this.eMail = eMail;
    }

    private void checkPassword() throws BadPasswordException {
//        1. pasword length
        if (password.length() < 8) {
            throw new BadPasswordException("Password length must be at least 8 characters");
        }

//        2. count digits
        int digitCount = 0;
        char ch;
        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if(Character.isDigit(ch)) {
                digitCount++;
            }
        }
        if (digitCount < 2) {
            throw new BadPasswordException("Password must be 2 digits");
        }

//        3. Upcase charset
        int upCase = 0;

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            if(Character.isDigit(ch)) {
                continue;
            }
            if(ch == Character.toUpperCase(ch)){
                upCase++;
            }
        }
        if (upCase < 2) {
            throw new BadPasswordException("Password must be 2 uppercase characters");
        }
    }

    public void checkData() throws BadEmailException, BadPasswordException {
        checkPassword();
    }
}
