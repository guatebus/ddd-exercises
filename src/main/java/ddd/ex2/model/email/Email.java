package ddd.ex2.model.email;

import ddd.ex2.model.agent.IIndependentAgent;

public class Email {
    public final boolean isValid;

    public Email(Object email){
        this.isValid = validate(email);
    }

    private boolean validate(Object email){
        return (email != null); //replace pattern-matching regex here
    }
}
