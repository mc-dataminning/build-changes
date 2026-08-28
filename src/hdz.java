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

public class hdz implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fjx c;
   private final UserApiService d;
   private final heh e;
   private final Path f;
   private final CompletableFuture<Optional<hef>> g;
   private final Supplier<hed> h = Suppliers.memoize(this::c);

   public hdz(fjx $$0, UserApiService $$1, fkk $$2) {
      this.c = $$0;
      this.d = $$1;
      heh.a $$3 = heh.a();
      $$2.f().ifPresent($$1x -> $$3.a(heg.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(heg.b, $$1x));
      $$3.a(heg.c, UUID.randomUUID());
      $$3.a(heg.d, ab.b().b());
      $$3.a(heg.e, ae.m().a());
      $$3.a(heg.f, System.getProperty("os.name"));
      $$3.a(heg.g, fjx.e().a());
      $$3.b(heg.h, fjx.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hef.a(this.f);
   }

   public hei a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hei(this.c(), $$0, $$1, $$2);
   }

   public hed a() {
      return this.h.get();
   }

   private hed c() {
      if (!this.c.E()) {
         return hed.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hed.a;
         } else {
            CompletableFuture<Optional<hec>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hec>>>map(hef::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fjx.Q().C()) {
                  heh.a $$4 = heh.a();
                  $$4.a(this.e);
                  $$4.a(heg.m, Instant.now());
                  $$4.a(heg.l, $$2.d());
                  $$3.accept($$4);
                  hea $$5 = new hea($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hec)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hef::close));
   }
}
