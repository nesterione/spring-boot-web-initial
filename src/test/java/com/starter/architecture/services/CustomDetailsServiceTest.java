package com.starter.architecture.services;

import com.starter.architecture.domain.Role;
import com.starter.architecture.domain.User;
import com.starter.architecture.repositories.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.security.core.userdetails.UserDetails;

import static org.mockito.Mockito.*;


public class CustomDetailsServiceTest {


    @Test
    public void getUserDetailsTest() {

        User fakeUser = new User();
        fakeUser.setId(1);
        fakeUser.setUsername("user");
        fakeUser.setPassword("user");
        fakeUser.setRole(Role.ROLE_USER);

        UserRepository repository = mock(UserRepository.class);
        when(repository.findByUsername("user")).thenReturn(fakeUser);

        CustomDetailsService service = new CustomDetailsService(repository);
        UserDetails userDetails = service.loadUserByUsername("user");

        Assert.assertEquals(userDetails.getUsername(), "user");
    }

}
