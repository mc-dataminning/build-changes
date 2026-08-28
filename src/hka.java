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

public class hka implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final flk c;
   private final UserApiService d;
   private final hki e;
   private final Path f;
   private final CompletableFuture<Optional<hkg>> g;
   private final Supplier<hke> h = Suppliers.memoize(this::c);

   public hka(flk $$0, UserApiService $$1, flw $$2) {
      this.c = $$0;
      this.d = $$1;
      hki.a $$3 = hki.a();
      $$2.f().ifPresent($$1x -> $$3.a(hkh.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hkh.b, $$1x));
      $$3.a(hkh.c, UUID.randomUUID());
      $$3.a(hkh.d, ab.b().b());
      $$3.a(hkh.e, af.n().a());
      $$3.a(hkh.f, System.getProperty("os.name"));
      $$3.a(hkh.g, flk.e().a());
      $$3.b(hkh.h, flk.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hkg.a(this.f);
   }

   public hkj a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hkj(this.c(), $$0, $$1, $$2);
   }

   public hke a() {
      return this.h.get();
   }

   private hke c() {
      if (!this.c.E()) {
         return hke.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hke.a;
         } else {
            CompletableFuture<Optional<hkd>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hkd>>>map(hkg::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || flk.Q().C()) {
                  hki.a $$4 = hki.a();
                  $$4.a(this.e);
                  $$4.a(hkh.m, Instant.now());
                  $$4.a(hkh.l, $$2.d());
                  $$3.accept($$4);
                  hkb $$5 = new hkb($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hkd)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hkg::close));
   }
}
