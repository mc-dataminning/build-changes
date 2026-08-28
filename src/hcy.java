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

public class hcy implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fja c;
   private final UserApiService d;
   private final hdg e;
   private final Path f;
   private final CompletableFuture<Optional<hde>> g;
   private final Supplier<hdc> h = Suppliers.memoize(this::c);

   public hcy(fja $$0, UserApiService $$1, fjn $$2) {
      this.c = $$0;
      this.d = $$1;
      hdg.a $$3 = hdg.a();
      $$2.f().ifPresent($$1x -> $$3.a(hdf.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hdf.b, $$1x));
      $$3.a(hdf.c, UUID.randomUUID());
      $$3.a(hdf.d, ab.b().b());
      $$3.a(hdf.e, ad.m().a());
      $$3.a(hdf.f, System.getProperty("os.name"));
      $$3.a(hdf.g, fja.e().a());
      $$3.b(hdf.h, fja.bh());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hde.a(this.f);
   }

   public hdh a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hdh(this.c(), $$0, $$1, $$2);
   }

   public hdc a() {
      return this.h.get();
   }

   private hdc c() {
      if (!this.c.E()) {
         return hdc.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hdc.a;
         } else {
            CompletableFuture<Optional<hdb>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hdb>>>map(hde::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fja.Q().C()) {
                  hdg.a $$4 = hdg.a();
                  $$4.a(this.e);
                  $$4.a(hdf.m, Instant.now());
                  $$4.a(hdf.l, $$2.d());
                  $$3.accept($$4);
                  hcz $$5 = new hcz($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hdb)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hde::close));
   }
}
