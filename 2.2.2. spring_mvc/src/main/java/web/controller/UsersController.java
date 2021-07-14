package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Controller;

@Controller
public class UsersController {
    @Autowired
    LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean;

}
