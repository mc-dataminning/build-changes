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

public class hor implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fpo c;
   private final UserApiService d;
   private final hoz e;
   private final Path f;
   private final CompletableFuture<Optional<hox>> g;
   private final Supplier<hov> h = Suppliers.memoize(this::c);

   public hor(fpo $$0, UserApiService $$1, fqa $$2) {
      this.c = $$0;
      this.d = $$1;
      hoz.a $$3 = hoz.a();
      $$2.f().ifPresent($$1x -> $$3.a(hoy.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hoy.b, $$1x));
      $$3.a(hoy.c, UUID.randomUUID());
      $$3.a(hoy.d, ac.b().b());
      $$3.a(hoy.e, ag.n().a());
      $$3.a(hoy.f, System.getProperty("os.name"));
      $$3.a(hoy.g, fpo.e().a());
      $$3.b(hoy.h, fpo.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hox.a(this.f);
   }

   public hpa a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hpa(this.c(), $$0, $$1, $$2);
   }

   public hov a() {
      return this.h.get();
   }

   private hov c() {
      if (!this.c.E()) {
         return hov.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hov.a;
         } else {
            CompletableFuture<Optional<hou>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hou>>>map(hox::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fpo.Q().C()) {
                  hoz.a $$4 = hoz.a();
                  $$4.a(this.e);
                  $$4.a(hoy.m, Instant.now());
                  $$4.a(hoy.l, $$2.d());
                  $$3.accept($$4);
                  hos $$5 = new hos($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hou)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hox::close));
   }
}
