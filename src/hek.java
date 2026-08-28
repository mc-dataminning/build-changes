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

public class hek implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fke c;
   private final UserApiService d;
   private final hes e;
   private final Path f;
   private final CompletableFuture<Optional<heq>> g;
   private final Supplier<heo> h = Suppliers.memoize(this::c);

   public hek(fke $$0, UserApiService $$1, fkr $$2) {
      this.c = $$0;
      this.d = $$1;
      hes.a $$3 = hes.a();
      $$2.f().ifPresent($$1x -> $$3.a(her.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(her.b, $$1x));
      $$3.a(her.c, UUID.randomUUID());
      $$3.a(her.d, ab.b().b());
      $$3.a(her.e, ae.m().a());
      $$3.a(her.f, System.getProperty("os.name"));
      $$3.a(her.g, fke.e().a());
      $$3.b(her.h, fke.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = heq.a(this.f);
   }

   public het a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new het(this.c(), $$0, $$1, $$2);
   }

   public heo a() {
      return this.h.get();
   }

   private heo c() {
      if (!this.c.E()) {
         return heo.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return heo.a;
         } else {
            CompletableFuture<Optional<hen>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hen>>>map(heq::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fke.Q().C()) {
                  hes.a $$4 = hes.a();
                  $$4.a(this.e);
                  $$4.a(her.m, Instant.now());
                  $$4.a(her.l, $$2.d());
                  $$3.accept($$4);
                  hel $$5 = new hel($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hen)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(heq::close));
   }
}
