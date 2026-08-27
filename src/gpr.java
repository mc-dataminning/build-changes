import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface gpr {
   void scheduleReload(gpr.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<gpr.b> b();
   }

   public static record b(UUID a, Path b) {
   }
}
