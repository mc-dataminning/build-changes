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

public class gtx implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffd c;
   private final UserApiService d;
   private final guf e;
   private final Path f;
   private final CompletableFuture<Optional<gud>> g;
   private final Supplier<gub> h = Suppliers.memoize(this::c);

   public gtx(ffd $$0, UserApiService $$1, ffr $$2) {
      this.c = $$0;
      this.d = $$1;
      guf.a $$3 = guf.a();
      $$2.f().ifPresent($$1x -> $$3.a(gue.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gue.b, $$1x));
      $$3.a(gue.c, UUID.randomUUID());
      $$3.a(gue.d, aa.b().b());
      $$3.a(gue.e, ac.k().a());
      $$3.a(gue.f, System.getProperty("os.name"));
      $$3.a(gue.g, ffd.e().a());
      $$3.b(gue.h, ffd.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gud.a(this.f);
   }

   public gug a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gug(this.c(), $$0, $$1, $$2);
   }

   public gub a() {
      return this.h.get();
   }

   private gub c() {
      if (!this.c.E()) {
         return gub.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gub.a;
         } else {
            CompletableFuture<Optional<gua>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gua>>>map(gud::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffd.Q().C()) {
                  guf.a $$4 = guf.a();
                  $$4.a(this.e);
                  $$4.a(gue.m, Instant.now());
                  $$4.a(gue.l, $$2.d());
                  $$3.accept($$4);
                  gty $$5 = new gty($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gua)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gud::close));
   }
}
