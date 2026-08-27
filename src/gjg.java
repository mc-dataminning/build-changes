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

public class gjg implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gjo d;
   private final Path e;
   private final CompletableFuture<Optional<gjm>> f;
   private final Supplier<gjk> g = Suppliers.memoize(this::c);

   public gjg(evg $$0, UserApiService $$1, evv $$2) {
      this.c = $$1;
      gjo.a $$3 = gjo.a();
      $$2.f().ifPresent($$1x -> $$3.a(gjn.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gjn.b, $$1x));
      $$3.a(gjn.c, UUID.randomUUID());
      $$3.a(gjn.d, aa.b().b());
      $$3.a(gjn.e, ac.j().a());
      $$3.a(gjn.f, System.getProperty("os.name"));
      $$3.a(gjn.g, evg.e().a());
      $$3.b(gjn.h, evg.bc());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gjm.a(this.e);
   }

   public gjp a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gjp(this.c(), $$0, $$1, $$2);
   }

   public gjk a() {
      return this.g.get();
   }

   private gjk c() {
      if (aa.aW) {
         return gjk.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gjk.a;
         } else {
            CompletableFuture<Optional<gjj>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gjj>>>map(gjm::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || evg.O().A()) {
                  gjo.a $$4 = gjo.a();
                  $$4.a(this.d);
                  $$4.a(gjn.m, Instant.now());
                  $$4.a(gjn.l, $$2.d());
                  $$3.accept($$4);
                  gjh $$5 = new gjh($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gjj)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gjm::close));
   }
}
