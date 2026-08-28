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

public class hjy implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fli c;
   private final UserApiService d;
   private final hkg e;
   private final Path f;
   private final CompletableFuture<Optional<hke>> g;
   private final Supplier<hkc> h = Suppliers.memoize(this::c);

   public hjy(fli $$0, UserApiService $$1, flu $$2) {
      this.c = $$0;
      this.d = $$1;
      hkg.a $$3 = hkg.a();
      $$2.f().ifPresent($$1x -> $$3.a(hkf.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hkf.b, $$1x));
      $$3.a(hkf.c, UUID.randomUUID());
      $$3.a(hkf.d, ab.b().b());
      $$3.a(hkf.e, af.m().a());
      $$3.a(hkf.f, System.getProperty("os.name"));
      $$3.a(hkf.g, fli.e().a());
      $$3.b(hkf.h, fli.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hke.a(this.f);
   }

   public hkh a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hkh(this.c(), $$0, $$1, $$2);
   }

   public hkc a() {
      return this.h.get();
   }

   private hkc c() {
      if (!this.c.E()) {
         return hkc.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hkc.a;
         } else {
            CompletableFuture<Optional<hkb>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hkb>>>map(hke::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fli.Q().C()) {
                  hkg.a $$4 = hkg.a();
                  $$4.a(this.e);
                  $$4.a(hkf.m, Instant.now());
                  $$4.a(hkf.l, $$2.d());
                  $$3.accept($$4);
                  hjz $$5 = new hjz($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hkb)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hke::close));
   }
}
