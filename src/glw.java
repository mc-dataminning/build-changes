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

public class glw implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final exo c;
   private final UserApiService d;
   private final gme e;
   private final Path f;
   private final CompletableFuture<Optional<gmc>> g;
   private final Supplier<gma> h = Suppliers.memoize(this::c);

   public glw(exo $$0, UserApiService $$1, eyd $$2) {
      this.c = $$0;
      this.d = $$1;
      gme.a $$3 = gme.a();
      $$2.f().ifPresent($$1x -> $$3.a(gmd.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gmd.b, $$1x));
      $$3.a(gmd.c, UUID.randomUUID());
      $$3.a(gmd.d, aa.b().b());
      $$3.a(gmd.e, ac.j().a());
      $$3.a(gmd.f, System.getProperty("os.name"));
      $$3.a(gmd.g, exo.e().a());
      $$3.b(gmd.h, exo.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gmc.a(this.f);
   }

   public gmf a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gmf(this.c(), $$0, $$1, $$2);
   }

   public gma a() {
      return this.h.get();
   }

   private gma c() {
      if (!this.c.D()) {
         return gma.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gma.a;
         } else {
            CompletableFuture<Optional<glz>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<glz>>>map(gmc::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || exo.P().B()) {
                  gme.a $$4 = gme.a();
                  $$4.a(this.e);
                  $$4.a(gmd.m, Instant.now());
                  $$4.a(gmd.l, $$2.d());
                  $$3.accept($$4);
                  glx $$5 = new glx($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((glz)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gmc::close));
   }
}
