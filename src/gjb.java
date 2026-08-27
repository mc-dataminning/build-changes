import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gjb implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ".json";
   private static final int c = 7;
   private final bfy d;
   @Nullable
   private CompletableFuture<Optional<gix>> e;

   private gjb(bfy $$0) {
      this.d = $$0;
   }

   public static CompletableFuture<Optional<gjb>> a(Path $$0) {
      return CompletableFuture.supplyAsync(() -> {
         try {
            bfy $$1 = bfy.a($$0, ".json");
            $$1.a().a(LocalDate.now(), 7).a();
            return Optional.of(new gjb($$1));
         } catch (Exception var2) {
            a.error("Failed to create telemetry log manager", var2);
            return Optional.empty();
         }
      }, ac.f());
   }

   public CompletableFuture<Optional<giy>> a() {
      if (this.e == null) {
         this.e = CompletableFuture.supplyAsync(() -> {
            try {
               bfy.e $$0 = this.d.a(LocalDate.now());
               FileChannel $$1 = $$0.e();
               return Optional.of(new gix($$1, ac.f()));
            } catch (IOException var3) {
               a.error("Failed to open channel for telemetry event log", var3);
               return Optional.empty();
            }
         }, ac.f());
      }

      return this.e.thenApply($$0 -> $$0.map(gix::a));
   }

   @Override
   public void close() {
      if (this.e != null) {
         this.e.thenAccept($$0 -> $$0.ifPresent(gix::close));
      }
   }
}
