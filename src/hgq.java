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

public class hgq implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fmf c;
   private final UserApiService d;
   private final hgy e;
   private final Path f;
   private final CompletableFuture<Optional<hgw>> g;
   private final Supplier<hgu> h = Suppliers.memoize(this::c);

   public hgq(fmf $$0, UserApiService $$1, fmr $$2) {
      this.c = $$0;
      this.d = $$1;
      hgy.a $$3 = hgy.a();
      $$2.f().ifPresent($$1x -> $$3.a(hgx.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hgx.b, $$1x));
      $$3.a(hgx.c, UUID.randomUUID());
      $$3.a(hgx.d, ab.b().b());
      $$3.a(hgx.e, ae.m().a());
      $$3.a(hgx.f, System.getProperty("os.name"));
      $$3.a(hgx.g, fmf.e().a());
      $$3.b(hgx.h, fmf.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hgw.a(this.f);
   }

   public hgz a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hgz(this.c(), $$0, $$1, $$2);
   }

   public hgu a() {
      return this.h.get();
   }

   private hgu c() {
      if (!this.c.E()) {
         return hgu.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hgu.a;
         } else {
            CompletableFuture<Optional<hgt>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hgt>>>map(hgw::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fmf.Q().C()) {
                  hgy.a $$4 = hgy.a();
                  $$4.a(this.e);
                  $$4.a(hgx.m, Instant.now());
                  $$4.a(hgx.l, $$2.d());
                  $$3.accept($$4);
                  hgr $$5 = new hgr($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hgt)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hgw::close));
   }
}
