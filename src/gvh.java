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

public class gvh implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fgm c;
   private final UserApiService d;
   private final gvp e;
   private final Path f;
   private final CompletableFuture<Optional<gvn>> g;
   private final Supplier<gvl> h = Suppliers.memoize(this::c);

   public gvh(fgm $$0, UserApiService $$1, fgz $$2) {
      this.c = $$0;
      this.d = $$1;
      gvp.a $$3 = gvp.a();
      $$2.f().ifPresent($$1x -> $$3.a(gvo.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gvo.b, $$1x));
      $$3.a(gvo.c, UUID.randomUUID());
      $$3.a(gvo.d, ab.b().b());
      $$3.a(gvo.e, ad.k().a());
      $$3.a(gvo.f, System.getProperty("os.name"));
      $$3.a(gvo.g, fgm.e().a());
      $$3.b(gvo.h, fgm.bc());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gvn.a(this.f);
   }

   public gvq a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gvq(this.c(), $$0, $$1, $$2);
   }

   public gvl a() {
      return this.h.get();
   }

   private gvl c() {
      if (!this.c.E()) {
         return gvl.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gvl.a;
         } else {
            CompletableFuture<Optional<gvk>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gvk>>>map(gvn::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fgm.Q().C()) {
                  gvp.a $$4 = gvp.a();
                  $$4.a(this.e);
                  $$4.a(gvo.m, Instant.now());
                  $$4.a(gvo.l, $$2.d());
                  $$3.accept($$4);
                  gvi $$5 = new gvi($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gvk)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gvn::close));
   }
}
