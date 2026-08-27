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

public class gqe implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fbp c;
   private final UserApiService d;
   private final gqm e;
   private final Path f;
   private final CompletableFuture<Optional<gqk>> g;
   private final Supplier<gqi> h = Suppliers.memoize(this::c);

   public gqe(fbp $$0, UserApiService $$1, fce $$2) {
      this.c = $$0;
      this.d = $$1;
      gqm.a $$3 = gqm.a();
      $$2.f().ifPresent($$1x -> $$3.a(gql.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gql.b, $$1x));
      $$3.a(gql.c, UUID.randomUUID());
      $$3.a(gql.d, aa.b().b());
      $$3.a(gql.e, ac.j().a());
      $$3.a(gql.f, System.getProperty("os.name"));
      $$3.a(gql.g, fbp.e().a());
      $$3.b(gql.h, fbp.bf());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gqk.a(this.f);
   }

   public gqn a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gqn(this.c(), $$0, $$1, $$2);
   }

   public gqi a() {
      return this.h.get();
   }

   private gqi c() {
      if (!this.c.E()) {
         return gqi.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gqi.a;
         } else {
            CompletableFuture<Optional<gqh>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gqh>>>map(gqk::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fbp.Q().C()) {
                  gqm.a $$4 = gqm.a();
                  $$4.a(this.e);
                  $$4.a(gql.m, Instant.now());
                  $$4.a(gql.l, $$2.d());
                  $$3.accept($$4);
                  gqf $$5 = new gqf($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gqh)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gqk::close));
   }
}
