package ddd.ex2.model.email;

import ddd.ex2.model.agent.IIndependentAgent;

public class EmailValidator {
    public boolean isValid(IIndependentAgent agent){
        return validate(agent.getEmail());
    }

    private boolean validate(Object email){
        return (email != null); //replace pattern-matching regex here
    }
}
