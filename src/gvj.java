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

public class gvj implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fgo c;
   private final UserApiService d;
   private final gvr e;
   private final Path f;
   private final CompletableFuture<Optional<gvp>> g;
   private final Supplier<gvn> h = Suppliers.memoize(this::c);

   public gvj(fgo $$0, UserApiService $$1, fhb $$2) {
      this.c = $$0;
      this.d = $$1;
      gvr.a $$3 = gvr.a();
      $$2.f().ifPresent($$1x -> $$3.a(gvq.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gvq.b, $$1x));
      $$3.a(gvq.c, UUID.randomUUID());
      $$3.a(gvq.d, ab.b().b());
      $$3.a(gvq.e, ad.k().a());
      $$3.a(gvq.f, System.getProperty("os.name"));
      $$3.a(gvq.g, fgo.e().a());
      $$3.b(gvq.h, fgo.bc());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gvp.a(this.f);
   }

   public gvs a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gvs(this.c(), $$0, $$1, $$2);
   }

   public gvn a() {
      return this.h.get();
   }

   private gvn c() {
      if (!this.c.E()) {
         return gvn.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gvn.a;
         } else {
            CompletableFuture<Optional<gvm>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gvm>>>map(gvp::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fgo.Q().C()) {
                  gvr.a $$4 = gvr.a();
                  $$4.a(this.e);
                  $$4.a(gvq.m, Instant.now());
                  $$4.a(gvq.l, $$2.d());
                  $$3.accept($$4);
                  gvk $$5 = new gvk($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gvm)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gvp::close));
   }
}
