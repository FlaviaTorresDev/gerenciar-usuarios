package flavia.dev.GerenciarUsuarios.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import flavia.dev.GerenciarUsuarios.repository.UsersRepo;

@Service
public class UsersDetailsService implements UserDetailsService {

    @Autowired
    private UsersRepo usersRepo;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usersRepo.findByEmail(username).orElseThrow();
    }
}