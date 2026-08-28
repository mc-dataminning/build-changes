import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class pk {
   public static void a(String[] $$0) throws IOException {
      ab.a(t.a);
      alg.a();

      for (String $$1 : $$0) {
         a($$1);
      }
   }

   private static void a(String $$0) throws IOException {
      try (Stream<Path> $$1 = Files.walk(Paths.get($$0))) {
         $$1.filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
            try {
               String $$1x = Files.readString($$0x);
               ug $$2 = uv.a($$1x);
               ug $$3 = pm.a($$0x.toString(), $$2);
               pj.a(ma.a, $$0x, uv.a($$3));
            } catch (IOException | CommandSyntaxException var4) {
               throw new RuntimeException(var4);
            }
         });
      }
   }
}
