package edu.iu.otiwari.c322finalbackend.security;

import edu.iu.otiwari.c322finalbackend.model.Customer;
import edu.iu.otiwari.c322finalbackend.repository.CustomerFileRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsSecurityService implements
        UserDetailsService {
    CustomerFileRepository customerRepository;

    public UserDetailsSecurityService(CustomerFileRepository
                                              customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        try {
            Customer customer =
                    customerRepository.findByUsername(username);
            if(customer == null) {
                throw new UsernameNotFoundException("");
            }
            return User
                    .withUsername(username)
                    .password(customer.password())
                    .build();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}