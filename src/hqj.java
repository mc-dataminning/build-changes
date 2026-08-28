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

public class hqj implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final frf c;
   private final UserApiService d;
   private final hqr e;
   private final Path f;
   private final CompletableFuture<Optional<hqp>> g;
   private final Supplier<hqn> h = Suppliers.memoize(this::c);

   public hqj(frf $$0, UserApiService $$1, frr $$2) {
      this.c = $$0;
      this.d = $$1;
      hqr.a $$3 = hqr.a();
      $$2.f().ifPresent($$1x -> $$3.a(hqq.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hqq.b, $$1x));
      $$3.a(hqq.c, UUID.randomUUID());
      $$3.a(hqq.d, ac.b().b());
      $$3.a(hqq.e, ag.n().a());
      $$3.a(hqq.f, System.getProperty("os.name"));
      $$3.a(hqq.g, frf.e().a());
      $$3.b(hqq.h, frf.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hqp.a(this.f);
   }

   public hqs a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hqs(this.c(), $$0, $$1, $$2);
   }

   public hqn a() {
      return this.h.get();
   }

   private hqn c() {
      if (!this.c.E()) {
         return hqn.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hqn.a;
         } else {
            CompletableFuture<Optional<hqm>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hqm>>>map(hqp::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || frf.Q().C()) {
                  hqr.a $$4 = hqr.a();
                  $$4.a(this.e);
                  $$4.a(hqq.m, Instant.now());
                  $$4.a(hqq.l, $$2.d());
                  $$3.accept($$4);
                  hqk $$5 = new hqk($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hqm)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hqp::close));
   }
}
