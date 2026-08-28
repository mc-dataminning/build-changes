import com.google.common.base.Suppliers;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.authlib.minecraft.UserApiService;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class gty implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffe c;
   private final UserApiService d;
   private final gug e;
   private final Path f;
   private final CompletableFuture<Optional<gue>> g;
   private final Supplier<guc> h = Suppliers.memoize(this::c);

   public gty(ffe $$0, UserApiService $$1, ffs $$2) {
      this.c = $$0;
      this.d = $$1;
      gug.a $$3 = gug.a();
      $$2.f().ifPresent($$1x -> $$3.a(guf.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(guf.b, $$1x));
      $$3.a(guf.c, UUID.randomUUID());
      $$3.a(guf.d, aa.b().b());
      $$3.a(guf.e, ac.k().a());
      $$3.a(guf.f, System.getProperty("os.name"));
      $$3.a(guf.g, ffe.e().a());
      $$3.b(guf.h, ffe.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gue.a(this.f);
   }

   public guh a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new guh(this.c(), $$0, $$1, $$2);
   }

   public guc a() {
      return this.h.get();
   }

   private guc c() {
      if (!this.c.E()) {
         return guc.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return guc.a;
         } else {
            CompletableFuture<Optional<gub>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gub>>>map(gue::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffe.Q().C()) {
                  gug.a $$4 = gug.a();
                  $$4.a(this.e);
                  $$4.a(guf.m, Instant.now());
                  $$4.a(guf.l, $$2.d());
                  $$3.accept($$4);
                  gtz $$5 = new gtz($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gub)$$2x.get()).log($$5);
                        $$5.a($$0).send();
                     }
                  });
               }
            };
         }
      }
   }

   public Path b() {
      return this.f;
   }

   @Override
   public void close() {
      this.g.thenAccept($$0 -> $$0.ifPresent(gue::close));
   }
}
