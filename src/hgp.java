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

public class hgp implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fme c;
   private final UserApiService d;
   private final hgx e;
   private final Path f;
   private final CompletableFuture<Optional<hgv>> g;
   private final Supplier<hgt> h = Suppliers.memoize(this::c);

   public hgp(fme $$0, UserApiService $$1, fmq $$2) {
      this.c = $$0;
      this.d = $$1;
      hgx.a $$3 = hgx.a();
      $$2.f().ifPresent($$1x -> $$3.a(hgw.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hgw.b, $$1x));
      $$3.a(hgw.c, UUID.randomUUID());
      $$3.a(hgw.d, ab.b().b());
      $$3.a(hgw.e, ae.m().a());
      $$3.a(hgw.f, System.getProperty("os.name"));
      $$3.a(hgw.g, fme.e().a());
      $$3.b(hgw.h, fme.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hgv.a(this.f);
   }

   public hgy a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hgy(this.c(), $$0, $$1, $$2);
   }

   public hgt a() {
      return this.h.get();
   }

   private hgt c() {
      if (!this.c.E()) {
         return hgt.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hgt.a;
         } else {
            CompletableFuture<Optional<hgs>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hgs>>>map(hgv::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fme.Q().C()) {
                  hgx.a $$4 = hgx.a();
                  $$4.a(this.e);
                  $$4.a(hgw.m, Instant.now());
                  $$4.a(hgw.l, $$2.d());
                  $$3.accept($$4);
                  hgq $$5 = new hgq($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hgs)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hgv::close));
   }
}
