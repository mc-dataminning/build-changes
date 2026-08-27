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

public class gmu implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final eyk c;
   private final UserApiService d;
   private final gnc e;
   private final Path f;
   private final CompletableFuture<Optional<gna>> g;
   private final Supplier<gmy> h = Suppliers.memoize(this::c);

   public gmu(eyk $$0, UserApiService $$1, eyz $$2) {
      this.c = $$0;
      this.d = $$1;
      gnc.a $$3 = gnc.a();
      $$2.f().ifPresent($$1x -> $$3.a(gnb.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gnb.b, $$1x));
      $$3.a(gnb.c, UUID.randomUUID());
      $$3.a(gnb.d, aa.b().b());
      $$3.a(gnb.e, ac.j().a());
      $$3.a(gnb.f, System.getProperty("os.name"));
      $$3.a(gnb.g, eyk.e().a());
      $$3.b(gnb.h, eyk.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gna.a(this.f);
   }

   public gnd a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gnd(this.c(), $$0, $$1, $$2);
   }

   public gmy a() {
      return this.h.get();
   }

   private gmy c() {
      if (!this.c.D()) {
         return gmy.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gmy.a;
         } else {
            CompletableFuture<Optional<gmx>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gmx>>>map(gna::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eyk.P().B()) {
                  gnc.a $$4 = gnc.a();
                  $$4.a(this.e);
                  $$4.a(gnb.m, Instant.now());
                  $$4.a(gnb.l, $$2.d());
                  $$3.accept($$4);
                  gmv $$5 = new gmv($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gmx)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gna::close));
   }
}
