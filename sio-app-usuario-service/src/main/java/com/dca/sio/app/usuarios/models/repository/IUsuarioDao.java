package com.dca.sio.app.usuarios.models.repository;

import com.dca.sio.app.users.commons.model.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path="users" )
public interface IUsuarioDao extends PagingAndSortingRepository<User, Long> {

    @RestResource(path="findUsername")
    User findByUsername(@Param("username") String username);
}
