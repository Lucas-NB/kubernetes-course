package org.example.pingpong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PongController {
  private int requestCounter = 0;


  @GetMapping("/pingpong")
  public String pongCounter() {
    this.requestCounter++;
    return String.format("pong %d", this.requestCounter);
  }
}
