package org.pattern.behavioral.chainofresponsability;

public class BillingSupportAgent implements SupportAgent {
    private SupportAgent nextAgent;

    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equals("Billing")) {
            System.out.println("Billing support agent handling request: " + request.getDescription());
        } else if (nextAgent != null) {
            nextAgent.handleRequest(request);
        } else {
            System.out.println("No agent available to handle request.");
        }
    }

    @Override
    public void setNextAgent(SupportAgent nextAgent) {
        this.nextAgent = nextAgent;
    }
}
