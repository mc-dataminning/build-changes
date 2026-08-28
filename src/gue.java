import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gue implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ".json";
   private static final int c = 7;
   private final blz d;
   @Nullable
   private CompletableFuture<Optional<gua>> e;

   private gue(blz $$0) {
      this.d = $$0;
   }

   public static CompletableFuture<Optional<gue>> a(Path $$0) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            blz $$1 = blz.a($$0, ".json");
            $$1.a().a(LocalDate.now(), 7).a();
            return Optional.of(new gue($$1));
         } catch (Exception var2) {
            a.error("Failed to create telemetry log manager", var2);
            return Optional.empty();
         }
      }, ac.g());
   }

   public CompletableFuture<Optional<gub>> a() {
      if (this.e == null) {
         this.e = CompletableFuture.supplyAsync(() -> {
            try {
               blz.e $$0 = this.d.a(LocalDate.now());
               FileChannel $$1 = $$0.e();
               return Optional.of(new gua($$1, ac.g()));
            } catch (IOException var3) {
               a.error("Failed to open channel for telemetry event log", var3);
               return Optional.empty();
            }
         }, ac.g());
      }

      return this.e.thenApply($$0 -> $$0.map(gua::a));
   }

   @Override
   public void close() {
      if (this.e != null) {
         this.e.thenAccept($$0 -> $$0.ifPresent(gua::close));
      }
   }
}
