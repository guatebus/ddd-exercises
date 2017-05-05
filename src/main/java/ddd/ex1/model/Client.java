package ddd.ex1.model;

import java.util.UUID;

public class Client {
    private UUID id;
    public Contact contactAgent(Ad ad){
        return ad.contactAgent(id);
    }
}
