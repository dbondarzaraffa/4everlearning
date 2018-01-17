package base;


import java.util.Random;

public class RandomGenerator{


        public String randomString() {

            String contain = "abcdefghijklmnopqrstuvwxyz";
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder(10);
            for (int i = 0; i<10; i++) {
                sb.append(contain.charAt(rnd.nextInt(contain.length())));
            }
            String randomString = sb.toString();
            return randomString;

        }

/*
    String name;
    String login;
    String subdomain;
    String email;

    public void newUser (String name, String login, String subdomain, String email) {
        this.name = name;
        this.login = login;
        this.subdomain = subdomain;
        this.email = email;
    }

    public void newUser (String login, String subdomain, String email) {
        this.login = login;
        this.subdomain = subdomain;
        this.email = email;
    }
*/







}
