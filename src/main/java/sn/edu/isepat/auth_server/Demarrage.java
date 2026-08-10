package sn.edu.isepat.auth_server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Demarrage implements CommandLineRunner {

    @Value("${isepat.dev.contact.prenom}")
    private String prenom;

    @Value("${isepat.dev.contact.nom}")
    private String nom;

    @Value("${isepat.adresse}")
    private String adresse;

    @Value("${isepat.dev.auth.pwd.minLength}")
    private Integer pwdMinLength;

    public Demarrage(){
        log.info("Demarrage");
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Demarrage du serveur");
        log.info("prenom: " + prenom);
        log.info("nom: " + nom);
        log.info("adresse: " + adresse);
        log.info("pwdMinLength: " + pwdMinLength);
    }
}
