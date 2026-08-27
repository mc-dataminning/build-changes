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

public class gdb implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gdj d;
   private final Path e;
   private final CompletableFuture<Optional<gdh>> f;
   private final Supplier<gdf> g = Suppliers.memoize(this::c);

   public gdb(eqm $$0, UserApiService $$1, erb $$2) {
      this.c = $$1;
      gdj.a $$3 = gdj.a();
      $$2.f().ifPresent($$1x -> $$3.a(gdi.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gdi.b, $$1x));
      $$3.a(gdi.c, UUID.randomUUID());
      $$3.a(gdi.d, aa.b().b());
      $$3.a(gdi.e, ac.i().a());
      $$3.a(gdi.f, System.getProperty("os.name"));
      $$3.a(gdi.g, eqm.e().a());
      $$3.b(gdi.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gdh.a(this.e);
   }

   public gdk a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gdk(this.c(), $$0, $$1, $$2);
   }

   public gdf a() {
      return this.g.get();
   }

   private gdf c() {
      if (aa.aS) {
         return gdf.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gdf.a;
         } else {
            CompletableFuture<Optional<gde>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gde>>>map(gdh::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eqm.O().A()) {
                  gdj.a $$4 = gdj.a();
                  $$4.a(this.d);
                  $$4.a(gdi.m, Instant.now());
                  $$4.a(gdi.l, $$2.d());
                  $$3.accept($$4);
                  gdc $$5 = new gdc($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gde)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gdh::close));
   }
}
