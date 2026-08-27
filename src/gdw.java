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

public class gdw implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gee d;
   private final Path e;
   private final CompletableFuture<Optional<gec>> f;
   private final Supplier<gea> g = Suppliers.memoize(this::c);

   public gdw(eqx $$0, UserApiService $$1, erm $$2) {
      this.c = $$1;
      gee.a $$3 = gee.a();
      $$2.f().ifPresent($$1x -> $$3.a(ged.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(ged.b, $$1x));
      $$3.a(ged.c, UUID.randomUUID());
      $$3.a(ged.d, aa.b().b());
      $$3.a(ged.e, ac.i().a());
      $$3.a(ged.f, System.getProperty("os.name"));
      $$3.a(ged.g, eqx.e().a());
      $$3.b(ged.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gec.a(this.e);
   }

   public gef a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gef(this.c(), $$0, $$1, $$2);
   }

   public gea a() {
      return this.g.get();
   }

   private gea c() {
      if (aa.aT) {
         return gea.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gea.a;
         } else {
            CompletableFuture<Optional<gdz>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gdz>>>map(gec::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eqx.O().A()) {
                  gee.a $$4 = gee.a();
                  $$4.a(this.d);
                  $$4.a(ged.m, Instant.now());
                  $$4.a(ged.l, $$2.d());
                  $$3.accept($$4);
                  gdx $$5 = new gdx($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gdz)$$2x.get()).log($$5);
                        $$5.a($$0).send();
                     }
                  });
               }
            };
         }
      }
   }

   public Path b() {
      return this.e;
   }

   @Override
   public void close() {
      this.f.thenAccept($$0 -> $$0.ifPresent(gec::close));
   }
}
