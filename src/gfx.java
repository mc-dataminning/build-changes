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

public class gfx implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final ggf d;
   private final Path e;
   private final CompletableFuture<Optional<ggd>> f;
   private final Supplier<ggb> g = Suppliers.memoize(this::c);

   public gfx(esr $$0, UserApiService $$1, etg $$2) {
      this.c = $$1;
      ggf.a $$3 = ggf.a();
      $$2.f().ifPresent($$1x -> $$3.a(gge.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gge.b, $$1x));
      $$3.a(gge.c, UUID.randomUUID());
      $$3.a(gge.d, aa.b().b());
      $$3.a(gge.e, ac.i().a());
      $$3.a(gge.f, System.getProperty("os.name"));
      $$3.a(gge.g, esr.e().a());
      $$3.b(gge.h, esr.bb());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = ggd.a(this.e);
   }

   public ggg a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new ggg(this.c(), $$0, $$1, $$2);
   }

   public ggb a() {
      return this.g.get();
   }

   private ggb c() {
      if (aa.aT) {
         return ggb.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return ggb.a;
         } else {
            CompletableFuture<Optional<gga>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gga>>>map(ggd::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || esr.N().z()) {
                  ggf.a $$4 = ggf.a();
                  $$4.a(this.d);
                  $$4.a(gge.m, Instant.now());
                  $$4.a(gge.l, $$2.d());
                  $$3.accept($$4);
                  gfy $$5 = new gfy($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gga)$$2x.get()).log($$5);
                        $$5.a($$0).send();
                     }
                  });
               }
            };
         }
      }
   }

   public Path b() {
      return this.e;
   }

   @Override
   public void close() {
      this.f.thenAccept($$0 -> $$0.ifPresent(ggd::close));
   }
}
