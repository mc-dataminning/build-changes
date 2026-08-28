import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class heq implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ".json";
   private static final int c = 7;
   private final bnl d;
   @Nullable
   private CompletableFuture<Optional<hem>> e;

   private heq(bnl $$0) {
      this.d = $$0;
   }

   public static CompletableFuture<Optional<heq>> a(Path $$0) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            bnl $$1 = bnl.a($$0, ".json");
            $$1.a().a(LocalDate.now(), 7).a();
            return Optional.of(new heq($$1));
         } catch (Exception var2) {
            a.error("Failed to create telemetry log manager", var2);
            return Optional.empty();
         }
      }, ae.g());
   }

   public CompletableFuture<Optional<hen>> a() {
      if (this.e == null) {
         this.e = CompletableFuture.supplyAsync(() -> {
            try {
               bnl.e $$0 = this.d.a(LocalDate.now());
               FileChannel $$1 = $$0.e();
               return Optional.of(new hem($$1, ae.g()));
            } catch (IOException var3) {
               a.error("Failed to open channel for telemetry event log", var3);
               return Optional.empty();
            }
         }, ae.g());
      }

      return this.e.thenApply($$0 -> $$0.map(hem::a));
   }

   @Override
   public void close() {
      if (this.e != null) {
         this.e.thenAccept($$0 -> $$0.ifPresent(hem::close));
      }
   }
}
