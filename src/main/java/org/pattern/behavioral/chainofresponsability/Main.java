package org.pattern.behavioral.chainofresponsability;

public class Main {
    public static void main(String[] args) {
        SupportAgent generalSupportAgent = new GeneralSupportAgent();
        SupportAgent technicalSupportAgent = new TechnicalSupportAgent();
        SupportAgent billingSupportAgent = new BillingSupportAgent();

        generalSupportAgent.setNextAgent(technicalSupportAgent);
        technicalSupportAgent.setNextAgent(billingSupportAgent);

        SupportRequest request1 = new SupportRequest("General", "I have a question about your product.");
        SupportRequest request2 = new SupportRequest("Technical", "I am having trouble with my account.");
        SupportRequest request3 = new SupportRequest("Billing", "I have a question about my bill.");

        generalSupportAgent.handleRequest(request1);
        generalSupportAgent.handleRequest(request2);
        generalSupportAgent.handleRequest(request3);
    }
}
