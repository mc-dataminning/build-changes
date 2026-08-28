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

public class gun implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffw c;
   private final UserApiService d;
   private final guv e;
   private final Path f;
   private final CompletableFuture<Optional<gut>> g;
   private final Supplier<gur> h = Suppliers.memoize(this::c);

   public gun(ffw $$0, UserApiService $$1, fgj $$2) {
      this.c = $$0;
      this.d = $$1;
      guv.a $$3 = guv.a();
      $$2.f().ifPresent($$1x -> $$3.a(guu.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(guu.b, $$1x));
      $$3.a(guu.c, UUID.randomUUID());
      $$3.a(guu.d, aa.b().b());
      $$3.a(guu.e, ac.k().a());
      $$3.a(guu.f, System.getProperty("os.name"));
      $$3.a(guu.g, ffw.e().a());
      $$3.b(guu.h, ffw.bc());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gut.a(this.f);
   }

   public guw a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new guw(this.c(), $$0, $$1, $$2);
   }

   public gur a() {
      return this.h.get();
   }

   private gur c() {
      if (!this.c.E()) {
         return gur.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gur.a;
         } else {
            CompletableFuture<Optional<guq>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<guq>>>map(gut::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffw.Q().C()) {
                  guv.a $$4 = guv.a();
                  $$4.a(this.e);
                  $$4.a(guu.m, Instant.now());
                  $$4.a(guu.l, $$2.d());
                  $$3.accept($$4);
                  guo $$5 = new guo($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((guq)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gut::close));
   }
}
