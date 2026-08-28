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

public class hgr implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fmg c;
   private final UserApiService d;
   private final hgz e;
   private final Path f;
   private final CompletableFuture<Optional<hgx>> g;
   private final Supplier<hgv> h = Suppliers.memoize(this::c);

   public hgr(fmg $$0, UserApiService $$1, fms $$2) {
      this.c = $$0;
      this.d = $$1;
      hgz.a $$3 = hgz.a();
      $$2.f().ifPresent($$1x -> $$3.a(hgy.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hgy.b, $$1x));
      $$3.a(hgy.c, UUID.randomUUID());
      $$3.a(hgy.d, ab.b().b());
      $$3.a(hgy.e, ae.m().a());
      $$3.a(hgy.f, System.getProperty("os.name"));
      $$3.a(hgy.g, fmg.e().a());
      $$3.b(hgy.h, fmg.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hgx.a(this.f);
   }

   public hha a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hha(this.c(), $$0, $$1, $$2);
   }

   public hgv a() {
      return this.h.get();
   }

   private hgv c() {
      if (!this.c.E()) {
         return hgv.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hgv.a;
         } else {
            CompletableFuture<Optional<hgu>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hgu>>>map(hgx::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fmg.Q().C()) {
                  hgz.a $$4 = hgz.a();
                  $$4.a(this.e);
                  $$4.a(hgy.m, Instant.now());
                  $$4.a(hgy.l, $$2.d());
                  $$3.accept($$4);
                  hgs $$5 = new hgs($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hgu)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hgx::close));
   }
}
