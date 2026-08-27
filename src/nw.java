import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class nw {
   public static void a(String[] $$0) throws IOException {
      aa.a(t.a);
      aje.a();

      for (String $$1 : $$0) {
         a($$1);
      }
   }

   private static void a(String $$0) throws IOException {
      try (Stream<Path> $$1 = Files.walk(Paths.get($$0))) {
         $$1.filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
            try {
               String $$1x = Files.readString($$0x);
               sy $$2 = tn.a($$1x);
               sy $$3 = ny.a($$0x.toString(), $$2);
               nv.a(km.a, $$0x, tn.c($$3));
            } catch (IOException | CommandSyntaxException var4) {
               throw new RuntimeException(var4);
            }
         });
      }
   }
}
