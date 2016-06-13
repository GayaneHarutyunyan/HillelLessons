package Lesson31;

import java.util.Optional;

/**
 * Created by User on 10.06.2016.
 */
public class Citizen {
        Optional<Passport> passport = Optional.empty();

        public Optional<Passport> getPassport() {
            return passport;
        }
    }