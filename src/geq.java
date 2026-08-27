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

public class geq implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gey d;
   private final Path e;
   private final CompletableFuture<Optional<gew>> f;
   private final Supplier<geu> g = Suppliers.memoize(this::c);

   public geq(ero $$0, UserApiService $$1, esd $$2) {
      this.c = $$1;
      gey.a $$3 = gey.a();
      $$2.f().ifPresent($$1x -> $$3.a(gex.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gex.b, $$1x));
      $$3.a(gex.c, UUID.randomUUID());
      $$3.a(gex.d, aa.b().b());
      $$3.a(gex.e, ac.i().a());
      $$3.a(gex.f, System.getProperty("os.name"));
      $$3.a(gex.g, ero.e().a());
      $$3.b(gex.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gew.a(this.e);
   }

   public gez a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gez(this.c(), $$0, $$1, $$2);
   }

   public geu a() {
      return this.g.get();
   }

   private geu c() {
      if (aa.aT) {
         return geu.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return geu.a;
         } else {
            CompletableFuture<Optional<get>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<get>>>map(gew::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ero.O().A()) {
                  gey.a $$4 = gey.a();
                  $$4.a(this.d);
                  $$4.a(gex.m, Instant.now());
                  $$4.a(gex.l, $$2.d());
                  $$3.accept($$4);
                  ger $$5 = new ger($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((get)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gew::close));
   }
}
