package org.example.todoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.server.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartUpPortLogger {
  private ServletWebServerApplicationContext context;

  @Autowired
  public StartUpPortLogger(ServletWebServerApplicationContext context) {
    this.context = context;
  }

  @EventListener(ApplicationReadyEvent.class)
  public void printPort() {
    int runningPort = this.context.getWebServer().getPort();

    System.out.println("--------------------------------------");
    System.out.printf("Server started in port %s\n", runningPort);
    System.out.println("--------------------------------------");
  }
}
