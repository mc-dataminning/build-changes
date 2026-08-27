import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.mojang.logging.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ml implements jk {
   private static final Logger d = LogUtils.getLogger();
   private final Iterable<Path> e;
   private final jm f;

   public ml(jm $$0, Collection<Path> $$1) {
      this.e = $$1;
      this.f = $$0;
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      Path $$1 = this.f.a();
      List<CompletableFuture<?>> $$2 = new ArrayList<>();

      for (Path $$3 : this.e) {
         $$2.add(
            CompletableFuture.<CompletableFuture>supplyAsync(
                  () -> {
                     try {
                        CompletableFuture var4;
                        try (Stream<Path> $$3x = Files.walk($$3)) {
                           var4 = CompletableFuture.allOf(
                              $$3x.filter($$0xx -> $$0xx.toString().endsWith(".nbt"))
                                 .map($$3xx -> CompletableFuture.runAsync(() -> a($$0, $$3xx, a($$3, $$3xx), $$1), ac.g()))
                                 .toArray(CompletableFuture[]::new)
                           );
                        }

                        return var4;
                     } catch (IOException var8) {
                        d.error("Failed to read structure input directory", var8);
                        return CompletableFuture.completedFuture(null);
                     }
                  },
                  ac.f()
               )
               .thenCompose($$0x -> $$0x)
         );
      }

      return CompletableFuture.allOf($$2.toArray(CompletableFuture[]::new));
   }

   @Override
   public final String a() {
      return "NBT -> SNBT";
   }

   private static String a(Path $$0, Path $$1) {
      String $$2 = $$0.relativize($$1).toString().replaceAll("\\\\", "/");
      return $$2.substring(0, $$2.length() - ".nbt".length());
   }

   @Nullable
   public static Path a(ji $$0, Path $$1, String $$2, Path $$3) {
      try {
         Path var6;
         try (InputStream $$4 = Files.newInputStream($$1)) {
            Path $$5 = $$3.resolve($$2 + ".snbt");
            a($$0, $$5, rl.c(rj.a($$4)));
            d.info("Converted {} from NBT to SNBT", $$2);
            var6 = $$5;
         }

         return var6;
      } catch (IOException var9) {
         d.error("Couldn't convert {} from NBT to SNBT at {}", new Object[]{$$2, $$1, var9});
         return null;
      }
   }

   public static void a(ji $$0, Path $$1, String $$2) throws IOException {
      ByteArrayOutputStream $$3 = new ByteArrayOutputStream();
      HashingOutputStream $$4 = new HashingOutputStream(Hashing.sha1(), $$3);
      $$4.write($$2.getBytes(StandardCharsets.UTF_8));
      $$4.write(10);
      $$0.writeIfNeeded($$1, $$3.toByteArray(), $$4.hash());
   }
}
