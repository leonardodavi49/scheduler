package com.integration.application.mailer;

public interface EmailService {
    public void sendEmail(String to, String subject, String body);
}
