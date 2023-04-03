package org.pattern.behavioral.chainofresponsability;

public interface SupportAgent {
    void handleRequest(SupportRequest request);
    void setNextAgent(SupportAgent nextAgent);
}
