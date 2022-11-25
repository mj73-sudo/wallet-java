package com.maktabsharif;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.Query;
import org.hibernate.Session;

import com.maktabsharif.entity.Account;
import com.maktabsharif.entity.Profile;
import com.maktabsharif.entity.Role;
import com.maktabsharif.entity.User;
import com.maktabsharif.entity.enums.AccountType;
import com.maktabsharif.service.ProfileService;
import com.maktabsharif.service.UserService;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        UserService service = new UserService();

        User user = new User();

        user.setFirstName("farhad");
        user.setLastName("mohammadi");
        user.setCreatedDate(ZonedDateTime.now().toEpochSecond());

        Account a1 = new Account();
        a1.setAccountType(AccountType.NORMAL_USER);
        a1.setBalance(1500l);
        a1.setLastTransaction(ZonedDateTime.now());
        a1.setUser(user);

        Account a2 = new Account();
        a2.setAccountType(AccountType.VIP);
        a2.setBalance(1000000l);
        a2.setLastTransaction(ZonedDateTime.now());
        a2.setUser(user);

        List<Account> accounts = new ArrayList<>();
        accounts.add(a1);
        accounts.add(a2);

        user.setAccounts(accounts);

        // Role r1 = new Role();
        // r1.setTitle("ADMIN");
        // r1.setUsers(List.of(user));
        // Role r2 = new Role();
        // r2.setTitle("OPERATOR");
        // r2.setUsers(List.of(user));

        // List<Role> roles = new ArrayList<>();
        // roles.add(r1);
        // roles.add(r2);

        service.create(user);

        List<User> allUsers = service.findAll();

        System.out.println(allUsers);


    }

}
