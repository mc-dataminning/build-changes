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

public class gjh implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gjp d;
   private final Path e;
   private final CompletableFuture<Optional<gjn>> f;
   private final Supplier<gjl> g = Suppliers.memoize(this::c);

   public gjh(evh $$0, UserApiService $$1, evw $$2) {
      this.c = $$1;
      gjp.a $$3 = gjp.a();
      $$2.f().ifPresent($$1x -> $$3.a(gjo.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gjo.b, $$1x));
      $$3.a(gjo.c, UUID.randomUUID());
      $$3.a(gjo.d, aa.b().b());
      $$3.a(gjo.e, ac.j().a());
      $$3.a(gjo.f, System.getProperty("os.name"));
      $$3.a(gjo.g, evh.e().a());
      $$3.b(gjo.h, evh.bc());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gjn.a(this.e);
   }

   public gjq a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gjq(this.c(), $$0, $$1, $$2);
   }

   public gjl a() {
      return this.g.get();
   }

   private gjl c() {
      if (aa.aW) {
         return gjl.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gjl.a;
         } else {
            CompletableFuture<Optional<gjk>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gjk>>>map(gjn::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || evh.O().A()) {
                  gjp.a $$4 = gjp.a();
                  $$4.a(this.d);
                  $$4.a(gjo.m, Instant.now());
                  $$4.a(gjo.l, $$2.d());
                  $$3.accept($$4);
                  gji $$5 = new gji($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gjk)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gjn::close));
   }
}
