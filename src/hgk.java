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

public class hgk implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final flz c;
   private final UserApiService d;
   private final hgs e;
   private final Path f;
   private final CompletableFuture<Optional<hgq>> g;
   private final Supplier<hgo> h = Suppliers.memoize(this::c);

   public hgk(flz $$0, UserApiService $$1, fml $$2) {
      this.c = $$0;
      this.d = $$1;
      hgs.a $$3 = hgs.a();
      $$2.f().ifPresent($$1x -> $$3.a(hgr.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hgr.b, $$1x));
      $$3.a(hgr.c, UUID.randomUUID());
      $$3.a(hgr.d, ab.b().b());
      $$3.a(hgr.e, ae.m().a());
      $$3.a(hgr.f, System.getProperty("os.name"));
      $$3.a(hgr.g, flz.e().a());
      $$3.b(hgr.h, flz.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hgq.a(this.f);
   }

   public hgt a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hgt(this.c(), $$0, $$1, $$2);
   }

   public hgo a() {
      return this.h.get();
   }

   private hgo c() {
      if (!this.c.E()) {
         return hgo.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hgo.a;
         } else {
            CompletableFuture<Optional<hgn>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hgn>>>map(hgq::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || flz.Q().C()) {
                  hgs.a $$4 = hgs.a();
                  $$4.a(this.e);
                  $$4.a(hgr.m, Instant.now());
                  $$4.a(hgr.l, $$2.d());
                  $$3.accept($$4);
                  hgl $$5 = new hgl($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hgn)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hgq::close));
   }
}
