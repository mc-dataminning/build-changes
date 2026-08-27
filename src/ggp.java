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

public class ggp implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final ggx d;
   private final Path e;
   private final CompletableFuture<Optional<ggv>> f;
   private final Supplier<ggt> g = Suppliers.memoize(this::c);

   public ggp(eti $$0, UserApiService $$1, etx $$2) {
      this.c = $$1;
      ggx.a $$3 = ggx.a();
      $$2.f().ifPresent($$1x -> $$3.a(ggw.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(ggw.b, $$1x));
      $$3.a(ggw.c, UUID.randomUUID());
      $$3.a(ggw.d, aa.b().b());
      $$3.a(ggw.e, ac.i().a());
      $$3.a(ggw.f, System.getProperty("os.name"));
      $$3.a(ggw.g, eti.e().a());
      $$3.b(ggw.h, eti.bb());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = ggv.a(this.e);
   }

   public ggy a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new ggy(this.c(), $$0, $$1, $$2);
   }

   public ggt a() {
      return this.g.get();
   }

   private ggt c() {
      if (aa.aT) {
         return ggt.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return ggt.a;
         } else {
            CompletableFuture<Optional<ggs>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<ggs>>>map(ggv::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eti.N().z()) {
                  ggx.a $$4 = ggx.a();
                  $$4.a(this.d);
                  $$4.a(ggw.m, Instant.now());
                  $$4.a(ggw.l, $$2.d());
                  $$3.accept($$4);
                  ggq $$5 = new ggq($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((ggs)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(ggv::close));
   }
}
