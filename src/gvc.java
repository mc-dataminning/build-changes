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

public class gvc implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fgi c;
   private final UserApiService d;
   private final gvk e;
   private final Path f;
   private final CompletableFuture<Optional<gvi>> g;
   private final Supplier<gvg> h = Suppliers.memoize(this::c);

   public gvc(fgi $$0, UserApiService $$1, fgv $$2) {
      this.c = $$0;
      this.d = $$1;
      gvk.a $$3 = gvk.a();
      $$2.f().ifPresent($$1x -> $$3.a(gvj.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gvj.b, $$1x));
      $$3.a(gvj.c, UUID.randomUUID());
      $$3.a(gvj.d, ab.b().b());
      $$3.a(gvj.e, ad.k().a());
      $$3.a(gvj.f, System.getProperty("os.name"));
      $$3.a(gvj.g, fgi.e().a());
      $$3.b(gvj.h, fgi.bc());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gvi.a(this.f);
   }

   public gvl a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gvl(this.c(), $$0, $$1, $$2);
   }

   public gvg a() {
      return this.h.get();
   }

   private gvg c() {
      if (!this.c.E()) {
         return gvg.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gvg.a;
         } else {
            CompletableFuture<Optional<gvf>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gvf>>>map(gvi::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fgi.Q().C()) {
                  gvk.a $$4 = gvk.a();
                  $$4.a(this.e);
                  $$4.a(gvj.m, Instant.now());
                  $$4.a(gvj.l, $$2.d());
                  $$3.accept($$4);
                  gvd $$5 = new gvd($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gvf)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gvi::close));
   }
}
