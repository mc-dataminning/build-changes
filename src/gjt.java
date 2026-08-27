import java.nio.file.Path;
import java.util.List;
import java.util.UUID;

public interface gjt {
   void scheduleReload(gjt.a var1);

   public interface a {
      void a();

      void a(boolean var1);

      List<gjt.b> b();
   }

   public static record b(UUID a, Path b) {
   }
}
