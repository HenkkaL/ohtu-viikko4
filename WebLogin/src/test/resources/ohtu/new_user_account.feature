Feature: A new user account can be created if a proper unused username and password are given

    Scenario: creation succesful with correct username and password
        Given new user is selected
        When  correct new "username" and password "salasana1" are given
        Then  new user is logged in

    Scenario: creation fails with too short username and valid passord
        Given new user is selected
        When  new username "us" and password "salasana1" and confirmation "salasana1" are given
        Then user is not created and error "username should have at least 3 characters" is reported

    Scenario: creation fails with correct username and too short password
        Given new user is selected
        When  new username "henkka" and password "sa" and confirmation "sa" are given
        Then user is not created and error "password should have at least 8 characters" is reported

    Scenario: creation fails with correct username and password consisting of letters
        Given new user is selected
        When  new username "henkka" and password "passwordpassword" and confirmation "passwordpassword" are given
        Then user is not created and error "password can not contain only letters" is reported 

    Scenario: creation fails with already taken username and valid pasword
        Given new user is selected
        When  new username "username" and password "password2" and confirmation "password2" are given
        Then user is not created and error "username is already taken" is reported 

    Scenario: creation fails when password and password confirmation do not match
        Given new user is selected
        When  new username "username2" and password "password2" and confirmation "other" are given
        Then user is not created and error "password and password confirmation do not match" is reported   