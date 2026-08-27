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

public class gqn implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fby c;
   private final UserApiService d;
   private final gqv e;
   private final Path f;
   private final CompletableFuture<Optional<gqt>> g;
   private final Supplier<gqr> h = Suppliers.memoize(this::c);

   public gqn(fby $$0, UserApiService $$1, fcn $$2) {
      this.c = $$0;
      this.d = $$1;
      gqv.a $$3 = gqv.a();
      $$2.f().ifPresent($$1x -> $$3.a(gqu.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gqu.b, $$1x));
      $$3.a(gqu.c, UUID.randomUUID());
      $$3.a(gqu.d, aa.b().b());
      $$3.a(gqu.e, ac.j().a());
      $$3.a(gqu.f, System.getProperty("os.name"));
      $$3.a(gqu.g, fby.e().a());
      $$3.b(gqu.h, fby.bf());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gqt.a(this.f);
   }

   public gqw a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gqw(this.c(), $$0, $$1, $$2);
   }

   public gqr a() {
      return this.h.get();
   }

   private gqr c() {
      if (!this.c.E()) {
         return gqr.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gqr.a;
         } else {
            CompletableFuture<Optional<gqq>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gqq>>>map(gqt::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fby.Q().C()) {
                  gqv.a $$4 = gqv.a();
                  $$4.a(this.e);
                  $$4.a(gqu.m, Instant.now());
                  $$4.a(gqu.l, $$2.d());
                  $$3.accept($$4);
                  gqo $$5 = new gqo($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gqq)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gqt::close));
   }
}
