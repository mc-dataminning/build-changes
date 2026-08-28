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

public class hlz implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fnd c;
   private final UserApiService d;
   private final hmh e;
   private final Path f;
   private final CompletableFuture<Optional<hmf>> g;
   private final Supplier<hmd> h = Suppliers.memoize(this::c);

   public hlz(fnd $$0, UserApiService $$1, fnp $$2) {
      this.c = $$0;
      this.d = $$1;
      hmh.a $$3 = hmh.a();
      $$2.f().ifPresent($$1x -> $$3.a(hmg.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hmg.b, $$1x));
      $$3.a(hmg.c, UUID.randomUUID());
      $$3.a(hmg.d, ab.b().b());
      $$3.a(hmg.e, af.n().a());
      $$3.a(hmg.f, System.getProperty("os.name"));
      $$3.a(hmg.g, fnd.e().a());
      $$3.b(hmg.h, fnd.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hmf.a(this.f);
   }

   public hmi a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hmi(this.c(), $$0, $$1, $$2);
   }

   public hmd a() {
      return this.h.get();
   }

   private hmd c() {
      if (!this.c.E()) {
         return hmd.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hmd.a;
         } else {
            CompletableFuture<Optional<hmc>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hmc>>>map(hmf::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fnd.Q().C()) {
                  hmh.a $$4 = hmh.a();
                  $$4.a(this.e);
                  $$4.a(hmg.m, Instant.now());
                  $$4.a(hmg.l, $$2.d());
                  $$3.accept($$4);
                  hma $$5 = new hma($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hmc)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hmf::close));
   }
}
