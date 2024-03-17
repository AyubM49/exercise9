public class Main {
    public static void main(String[] args) {
        phoneNumber phonenumber1 =  new phoneNumber("0987654321");
        Email email1 = new Email("Ayub@gmail.com");

        phonenumber1.contact();
        email1.contact();


    }
}

abstract class Contact {

    abstract public void contact();

}

class Email extends Contact {
    private String email;

    public Email( String email) {
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("Currently Emailing " + email);
    }
}

class phoneNumber extends Contact {
    private String phonenumber;

    public phoneNumber( String number) {
        this.phonenumber = phonenumber;
    }

    @Override
    public void contact() {
        System.out.println("Currently Calling " + phonenumber);
    }
}