package com.anf2.emailsender.controller;

import com.anf2.emailsender.entity.EmailMessage;
import com.anf2.emailsender.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("send-email")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) {
        emailSenderService.sendEmail(emailMessage.getTo(), emailMessage.getSubject(), emailMessage.getBody());

        return ResponseEntity.ok("Successes!!!");
    }
}
