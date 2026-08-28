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

public class hjt implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final flh c;
   private final UserApiService d;
   private final hkb e;
   private final Path f;
   private final CompletableFuture<Optional<hjz>> g;
   private final Supplier<hjx> h = Suppliers.memoize(this::c);

   public hjt(flh $$0, UserApiService $$1, flt $$2) {
      this.c = $$0;
      this.d = $$1;
      hkb.a $$3 = hkb.a();
      $$2.f().ifPresent($$1x -> $$3.a(hka.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hka.b, $$1x));
      $$3.a(hka.c, UUID.randomUUID());
      $$3.a(hka.d, ab.b().b());
      $$3.a(hka.e, af.m().a());
      $$3.a(hka.f, System.getProperty("os.name"));
      $$3.a(hka.g, flh.e().a());
      $$3.b(hka.h, flh.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hjz.a(this.f);
   }

   public hkc a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hkc(this.c(), $$0, $$1, $$2);
   }

   public hjx a() {
      return this.h.get();
   }

   private hjx c() {
      if (!this.c.E()) {
         return hjx.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hjx.a;
         } else {
            CompletableFuture<Optional<hjw>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hjw>>>map(hjz::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || flh.Q().C()) {
                  hkb.a $$4 = hkb.a();
                  $$4.a(this.e);
                  $$4.a(hka.m, Instant.now());
                  $$4.a(hka.l, $$2.d());
                  $$3.accept($$4);
                  hju $$5 = new hju($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hjw)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hjz::close));
   }
}
