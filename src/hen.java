import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface hen {
   void scheduleReload(hen.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<hen.b> b();
   }

   public static record b(UUID a, Path b) {
   }
}
