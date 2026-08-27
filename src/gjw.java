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

public class gjw implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final evr c;
   private final UserApiService d;
   private final gke e;
   private final Path f;
   private final CompletableFuture<Optional<gkc>> g;
   private final Supplier<gka> h = Suppliers.memoize(this::c);

   public gjw(evr $$0, UserApiService $$1, ewg $$2) {
      this.c = $$0;
      this.d = $$1;
      gke.a $$3 = gke.a();
      $$2.f().ifPresent($$1x -> $$3.a(gkd.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gkd.b, $$1x));
      $$3.a(gkd.c, UUID.randomUUID());
      $$3.a(gkd.d, aa.b().b());
      $$3.a(gkd.e, ac.j().a());
      $$3.a(gkd.f, System.getProperty("os.name"));
      $$3.a(gkd.g, evr.e().a());
      $$3.b(gkd.h, evr.bd());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gkc.a(this.f);
   }

   public gkf a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gkf(this.c(), $$0, $$1, $$2);
   }

   public gka a() {
      return this.h.get();
   }

   private gka c() {
      if (!this.c.C()) {
         return gka.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gka.a;
         } else {
            CompletableFuture<Optional<gjz>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gjz>>>map(gkc::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || evr.O().A()) {
                  gke.a $$4 = gke.a();
                  $$4.a(this.e);
                  $$4.a(gkd.m, Instant.now());
                  $$4.a(gkd.l, $$2.d());
                  $$3.accept($$4);
                  gjx $$5 = new gjx($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gjz)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gkc::close));
   }
}
