package com.anf2.emailsender.service;

public interface EmailSenderService {
    void sendEmail(String to,String subject,String message);
}
