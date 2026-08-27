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

public class ggk implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final ggs d;
   private final Path e;
   private final CompletableFuture<Optional<ggq>> f;
   private final Supplier<ggo> g = Suppliers.memoize(this::c);

   public ggk(etd $$0, UserApiService $$1, ets $$2) {
      this.c = $$1;
      ggs.a $$3 = ggs.a();
      $$2.f().ifPresent($$1x -> $$3.a(ggr.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(ggr.b, $$1x));
      $$3.a(ggr.c, UUID.randomUUID());
      $$3.a(ggr.d, aa.b().b());
      $$3.a(ggr.e, ac.i().a());
      $$3.a(ggr.f, System.getProperty("os.name"));
      $$3.a(ggr.g, etd.e().a());
      $$3.b(ggr.h, etd.bb());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = ggq.a(this.e);
   }

   public ggt a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new ggt(this.c(), $$0, $$1, $$2);
   }

   public ggo a() {
      return this.g.get();
   }

   private ggo c() {
      if (aa.aT) {
         return ggo.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return ggo.a;
         } else {
            CompletableFuture<Optional<ggn>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<ggn>>>map(ggq::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || etd.N().z()) {
                  ggs.a $$4 = ggs.a();
                  $$4.a(this.d);
                  $$4.a(ggr.m, Instant.now());
                  $$4.a(ggr.l, $$2.d());
                  $$3.accept($$4);
                  ggl $$5 = new ggl($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((ggn)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(ggq::close));
   }
}
