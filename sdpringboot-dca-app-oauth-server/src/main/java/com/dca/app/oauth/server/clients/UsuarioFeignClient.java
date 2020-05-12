package com.dca.app.oauth.server.clients;

import com.dca.sio.app.users.commons.model.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//
@FeignClient(name = "sio-user-service")
public interface UsuarioFeignClient {

    @GetMapping("/users/search/findUsername")
    User findByUsername(@RequestParam("username") String username);
}
