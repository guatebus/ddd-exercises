package ddd.ex1.model;

import java.util.UUID;

public class Ad {
    private UUID id;
    private UUID agentId;
    public Ad(Property property, UUID agentId)
    {
        this.agentId = agentId;
    }

    public Contact contactAgent(UUID clientId) {
        return new Contact(id, clientId);
    }

    public void unpublish(UUID id) {
        if (id == agentId){
            internalUnpublish();
        }
    }

    private void internalUnpublish() {

    }
}
