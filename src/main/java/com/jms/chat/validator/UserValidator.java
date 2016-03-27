package com.jms.chat.validator;

import com.jms.chat.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    Logger logger = Logger.getLogger(UserValidator.class);
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String mail = user.getEmail();
        String password = user.getPassword();
        String name = user.getName();
        if (password == null || password.length() < 6) {
            errors.rejectValue("password", "incorrect", "You password is too easy");
        }
        if (mail == null || !mail.matches(EMAIL_PATTERN)) {
            errors.rejectValue("email", "incorrect", "Invalid email address!");
        }
        if (name == null || name.length() < 4) {
            errors.rejectValue("name", "incorrect", "Name must be at least 3 characters!");
        }
    }
}
