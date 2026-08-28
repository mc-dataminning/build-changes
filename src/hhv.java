import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface hhv {
   void scheduleReload(hhv.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<hhv.b> b();
   }

   public static record b(UUID a, Path b) {
   }
}
