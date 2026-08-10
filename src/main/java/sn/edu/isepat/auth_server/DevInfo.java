package sn.edu.isepat.auth_server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/devs/info")
@RefreshScope
public class DevInfo {

    private final String instanceId = UUID.randomUUID().toString();

    private final ServiceInfo serviceInfo;

    public DevInfo(ServiceInfo serviceInfo) {
        log.info("Demarrage");
        this.serviceInfo = serviceInfo;
    }

    @GetMapping
    public Map<String, String> getInfo() {
        var resutl =serviceInfo.getInfo();
        resutl.put("instanceId", instanceId);
        log.info("resutl:{}",resutl);
        return resutl;
    }
}
