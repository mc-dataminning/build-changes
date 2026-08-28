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

public class hjz implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final flj c;
   private final UserApiService d;
   private final hkh e;
   private final Path f;
   private final CompletableFuture<Optional<hkf>> g;
   private final Supplier<hkd> h = Suppliers.memoize(this::c);

   public hjz(flj $$0, UserApiService $$1, flv $$2) {
      this.c = $$0;
      this.d = $$1;
      hkh.a $$3 = hkh.a();
      $$2.f().ifPresent($$1x -> $$3.a(hkg.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hkg.b, $$1x));
      $$3.a(hkg.c, UUID.randomUUID());
      $$3.a(hkg.d, ab.b().b());
      $$3.a(hkg.e, af.m().a());
      $$3.a(hkg.f, System.getProperty("os.name"));
      $$3.a(hkg.g, flj.e().a());
      $$3.b(hkg.h, flj.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hkf.a(this.f);
   }

   public hki a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hki(this.c(), $$0, $$1, $$2);
   }

   public hkd a() {
      return this.h.get();
   }

   private hkd c() {
      if (!this.c.E()) {
         return hkd.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hkd.a;
         } else {
            CompletableFuture<Optional<hkc>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hkc>>>map(hkf::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || flj.Q().C()) {
                  hkh.a $$4 = hkh.a();
                  $$4.a(this.e);
                  $$4.a(hkg.m, Instant.now());
                  $$4.a(hkg.l, $$2.d());
                  $$3.accept($$4);
                  hka $$5 = new hka($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hkc)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hkf::close));
   }
}
