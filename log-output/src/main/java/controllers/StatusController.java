package controllers;

import io.javalin.http.Context;
import services.StatusService;

public class StatusController {
  private StatusService statusService;

  public StatusController() {
    this.statusService = new StatusService();
  }

  public void status(Context context) {
    String currentStatus = this.statusService.getCurrentStatus();
    context.result(currentStatus);
  }
}
