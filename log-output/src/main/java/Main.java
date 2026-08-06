import io.javalin.Javalin;

public class Main {
  public static void main(String[] args) {
    AppRouter appRouter = new AppRouter();
    Javalin javalinApp = Javalin.create();
    javalinApp.start(9999);
    appRouter.configureRoutes(javalinApp);
  }
}
