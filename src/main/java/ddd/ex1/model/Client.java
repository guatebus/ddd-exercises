package ddd.ex1.model;

import java.util.UUID;

/**
 * Created by alejandro.bustamante on 05/05/17.
 */
public class Client {
    private UUID id;
    public Contact contactAgent(Ad ad){
        return ad.contactAgent(id);
    }
}
