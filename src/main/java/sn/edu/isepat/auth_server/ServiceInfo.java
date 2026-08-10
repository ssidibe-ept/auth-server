package sn.edu.isepat.auth_server;


import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
@RefreshScope
public class ServiceInfo {

    @Value("${isepat.dev.contact.prenom}")
    private String prenom;

    @Value("${isepat.dev.contact.nom}")
    private String nom;

    @Value("${isepat.adresse}")
    private String adresse;

    public Map<String, String> getInfo() {
        log.info("getInfo");
        Map<String, String> info = new HashMap<>();
        info.put("prenom", prenom);
        info.put("nom", nom);
        info.put("adresse", adresse);
        return info;
    }

}
