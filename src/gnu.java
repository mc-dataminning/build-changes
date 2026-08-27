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

public class gnu implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ezg c;
   private final UserApiService d;
   private final goc e;
   private final Path f;
   private final CompletableFuture<Optional<goa>> g;
   private final Supplier<gny> h = Suppliers.memoize(this::c);

   public gnu(ezg $$0, UserApiService $$1, ezv $$2) {
      this.c = $$0;
      this.d = $$1;
      goc.a $$3 = goc.a();
      $$2.f().ifPresent($$1x -> $$3.a(gob.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gob.b, $$1x));
      $$3.a(gob.c, UUID.randomUUID());
      $$3.a(gob.d, aa.b().b());
      $$3.a(gob.e, ac.j().a());
      $$3.a(gob.f, System.getProperty("os.name"));
      $$3.a(gob.g, ezg.e().a());
      $$3.b(gob.h, ezg.bf());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = goa.a(this.f);
   }

   public god a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new god(this.c(), $$0, $$1, $$2);
   }

   public gny a() {
      return this.h.get();
   }

   private gny c() {
      if (!this.c.E()) {
         return gny.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gny.a;
         } else {
            CompletableFuture<Optional<gnx>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gnx>>>map(goa::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ezg.Q().C()) {
                  goc.a $$4 = goc.a();
                  $$4.a(this.e);
                  $$4.a(gob.m, Instant.now());
                  $$4.a(gob.l, $$2.d());
                  $$3.accept($$4);
                  gnv $$5 = new gnv($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gnx)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(goa::close));
   }
}
