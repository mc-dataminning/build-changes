import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface grr {
   void scheduleReload(grr.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<grr.b> b();
   }

   public static record b(UUID a, Path b) {
   }
}
