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

public class gdp implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gdx d;
   private final Path e;
   private final CompletableFuture<Optional<gdv>> f;
   private final Supplier<gdt> g = Suppliers.memoize(this::c);

   public gdp(eqq $$0, UserApiService $$1, erf $$2) {
      this.c = $$1;
      gdx.a $$3 = gdx.a();
      $$2.f().ifPresent($$1x -> $$3.a(gdw.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gdw.b, $$1x));
      $$3.a(gdw.c, UUID.randomUUID());
      $$3.a(gdw.d, aa.b().b());
      $$3.a(gdw.e, ac.i().a());
      $$3.a(gdw.f, System.getProperty("os.name"));
      $$3.a(gdw.g, eqq.e().a());
      $$3.b(gdw.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gdv.a(this.e);
   }

   public gdy a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gdy(this.c(), $$0, $$1, $$2);
   }

   public gdt a() {
      return this.g.get();
   }

   private gdt c() {
      if (aa.aS) {
         return gdt.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gdt.a;
         } else {
            CompletableFuture<Optional<gds>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gds>>>map(gdv::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eqq.O().A()) {
                  gdx.a $$4 = gdx.a();
                  $$4.a(this.d);
                  $$4.a(gdw.m, Instant.now());
                  $$4.a(gdw.l, $$2.d());
                  $$3.accept($$4);
                  gdq $$5 = new gdq($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gds)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gdv::close));
   }
}
