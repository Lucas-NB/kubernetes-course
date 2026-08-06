import controllers.StatusController;
import io.javalin.Javalin;

public class AppRouter {
  private StatusController statusController;

  public AppRouter() {
    this.statusController = new StatusController();
  }

  public void configureRoutes(Javalin app) {
    app.get("/status", ctx -> statusController.status(ctx));
  }
}
