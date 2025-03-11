abstract class Contacts {
    private String name;

    public Contacts(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                '}';
    }

    abstract public void contact();
}

class ToEmail extends Contacts{
    private String email;

    public ToEmail(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("You're emailing mariahdungey12@gmail.com");

    }
}

class ToCall extends Contacts{
    private long number;

    public ToCall(String name, long number) {
        super(name);
        this.number = number;
    }

    @Override
    public void contact() {
        System.out.println("You're calling 614-327-7109");
    }
}