import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class nh {
   public static void a(String[] $$0) throws IOException {
      aa.a(t.a);
      afy.a();

      for (String $$1 : $$0) {
         a($$1);
      }
   }

   private static void a(String $$0) throws IOException {
      try (Stream<Path> $$1 = Files.walk(Paths.get($$0))) {
         $$1.filter($$0x -> $$0x.toString().endsWith(".snbt")).forEach($$0x -> {
            try {
               String $$1x = Files.readString($$0x);
               rt $$2 = sg.a($$1x);
               rt $$3 = nj.a($$0x.toString(), $$2);
               ng.a(kd.a, $$0x, sg.c($$3));
            } catch (IOException | CommandSyntaxException var4) {
               throw new RuntimeException(var4);
            }
         });
      }
   }
}
