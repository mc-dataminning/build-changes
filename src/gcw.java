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

public class gcw implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gde d;
   private final Path e;
   private final CompletableFuture<Optional<gdc>> f;
   private final Supplier<gda> g = Suppliers.memoize(this::c);

   public gcw(eqn $$0, UserApiService $$1, erc $$2) {
      this.c = $$1;
      gde.a $$3 = gde.a();
      $$2.f().ifPresent($$1x -> $$3.a(gdd.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gdd.b, $$1x));
      $$3.a(gdd.c, UUID.randomUUID());
      $$3.a(gdd.d, aa.b().b());
      $$3.a(gdd.e, ac.i().a());
      $$3.a(gdd.f, System.getProperty("os.name"));
      $$3.a(gdd.g, eqn.d().a());
      $$3.b(gdd.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gdc.a(this.e);
   }

   public gdf a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gdf(this.c(), $$0, $$1, $$2);
   }

   public gda a() {
      return this.g.get();
   }

   private gda c() {
      if (aa.aS) {
         return gda.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gda.a;
         } else {
            CompletableFuture<Optional<gcz>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gcz>>>map(gdc::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eqn.N().z()) {
                  gde.a $$4 = gde.a();
                  $$4.a(this.d);
                  $$4.a(gdd.m, Instant.now());
                  $$4.a(gdd.l, $$2.d());
                  $$3.accept($$4);
                  gcx $$5 = new gcx($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gcz)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gdc::close));
   }
}
