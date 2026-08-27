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

public class gnx implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ezi c;
   private final UserApiService d;
   private final gof e;
   private final Path f;
   private final CompletableFuture<Optional<god>> g;
   private final Supplier<gob> h = Suppliers.memoize(this::c);

   public gnx(ezi $$0, UserApiService $$1, ezx $$2) {
      this.c = $$0;
      this.d = $$1;
      gof.a $$3 = gof.a();
      $$2.f().ifPresent($$1x -> $$3.a(goe.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(goe.b, $$1x));
      $$3.a(goe.c, UUID.randomUUID());
      $$3.a(goe.d, aa.b().b());
      $$3.a(goe.e, ac.j().a());
      $$3.a(goe.f, System.getProperty("os.name"));
      $$3.a(goe.g, ezi.e().a());
      $$3.b(goe.h, ezi.bf());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = god.a(this.f);
   }

   public gog a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gog(this.c(), $$0, $$1, $$2);
   }

   public gob a() {
      return this.h.get();
   }

   private gob c() {
      if (!this.c.E()) {
         return gob.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gob.a;
         } else {
            CompletableFuture<Optional<goa>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<goa>>>map(god::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ezi.Q().C()) {
                  gof.a $$4 = gof.a();
                  $$4.a(this.e);
                  $$4.a(goe.m, Instant.now());
                  $$4.a(goe.l, $$2.d());
                  $$3.accept($$4);
                  gny $$5 = new gny($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((goa)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(god::close));
   }
}
