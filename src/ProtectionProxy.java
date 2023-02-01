import java.util.Scanner;

public class ProtectionProxy implements Provider {
    private Provider provider;
    private String password;
    private Scanner sc;

    public ProtectionProxy(Provider provider, String password) {
        this.provider = provider;
        this.password = password;
    }

    public void service1() {
        provider.service1();
    }

    public void service2() {
        provider.service2();
    }

    public void service3() {
        if (authorizedAccess()) provider.service3();
        else System.out.println("Accès non autorisé");
    }

    public void service4() {
        if (authorizedAccess()) provider.service4();
        else System.out.println("Accès non autorisé");
    }

    private boolean authorizedAccess() {
        System.out.println("Entrez le mot de passe (1234) : ");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
        return password.equals(this.password);
    }
}
