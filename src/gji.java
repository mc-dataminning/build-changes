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

public class gji implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final evi c;
   private final UserApiService d;
   private final gjq e;
   private final Path f;
   private final CompletableFuture<Optional<gjo>> g;
   private final Supplier<gjm> h = Suppliers.memoize(this::c);

   public gji(evi $$0, UserApiService $$1, evx $$2) {
      this.c = $$0;
      this.d = $$1;
      gjq.a $$3 = gjq.a();
      $$2.f().ifPresent($$1x -> $$3.a(gjp.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gjp.b, $$1x));
      $$3.a(gjp.c, UUID.randomUUID());
      $$3.a(gjp.d, aa.b().b());
      $$3.a(gjp.e, ac.j().a());
      $$3.a(gjp.f, System.getProperty("os.name"));
      $$3.a(gjp.g, evi.e().a());
      $$3.b(gjp.h, evi.bd());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gjo.a(this.f);
   }

   public gjr a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gjr(this.c(), $$0, $$1, $$2);
   }

   public gjm a() {
      return this.h.get();
   }

   private gjm c() {
      if (!this.c.C()) {
         return gjm.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gjm.a;
         } else {
            CompletableFuture<Optional<gjl>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gjl>>>map(gjo::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || evi.O().A()) {
                  gjq.a $$4 = gjq.a();
                  $$4.a(this.e);
                  $$4.a(gjp.m, Instant.now());
                  $$4.a(gjp.l, $$2.d());
                  $$3.accept($$4);
                  gjj $$5 = new gjj($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gjl)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gjo::close));
   }
}
