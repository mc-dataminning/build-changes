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

public class gdq implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gdy d;
   private final Path e;
   private final CompletableFuture<Optional<gdw>> f;
   private final Supplier<gdu> g = Suppliers.memoize(this::c);

   public gdq(eqp $$0, UserApiService $$1, ere $$2) {
      this.c = $$1;
      gdy.a $$3 = gdy.a();
      $$2.f().ifPresent($$1x -> $$3.a(gdx.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gdx.b, $$1x));
      $$3.a(gdx.c, UUID.randomUUID());
      $$3.a(gdx.d, aa.b().b());
      $$3.a(gdx.e, ac.i().a());
      $$3.a(gdx.f, System.getProperty("os.name"));
      $$3.a(gdx.g, eqp.e().a());
      $$3.b(gdx.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gdw.a(this.e);
   }

   public gdz a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gdz(this.c(), $$0, $$1, $$2);
   }

   public gdu a() {
      return this.g.get();
   }

   private gdu c() {
      if (aa.aT) {
         return gdu.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gdu.a;
         } else {
            CompletableFuture<Optional<gdt>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gdt>>>map(gdw::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eqp.O().A()) {
                  gdy.a $$4 = gdy.a();
                  $$4.a(this.d);
                  $$4.a(gdx.m, Instant.now());
                  $$4.a(gdx.l, $$2.d());
                  $$3.accept($$4);
                  gdr $$5 = new gdr($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gdt)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gdw::close));
   }
}
