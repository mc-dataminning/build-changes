import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface hoc {
   void scheduleReload(hoc.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<hoc.b> b();
   }

   public static record b(UUID a, Path b) {
   }
}
