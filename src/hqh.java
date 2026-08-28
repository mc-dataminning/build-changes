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

public class hqh implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final frd c;
   private final UserApiService d;
   private final hqp e;
   private final Path f;
   private final CompletableFuture<Optional<hqn>> g;
   private final Supplier<hql> h = Suppliers.memoize(this::c);

   public hqh(frd $$0, UserApiService $$1, frp $$2) {
      this.c = $$0;
      this.d = $$1;
      hqp.a $$3 = hqp.a();
      $$2.f().ifPresent($$1x -> $$3.a(hqo.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hqo.b, $$1x));
      $$3.a(hqo.c, UUID.randomUUID());
      $$3.a(hqo.d, ac.b().b());
      $$3.a(hqo.e, ag.n().a());
      $$3.a(hqo.f, System.getProperty("os.name"));
      $$3.a(hqo.g, frd.e().a());
      $$3.b(hqo.h, frd.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hqn.a(this.f);
   }

   public hqq a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hqq(this.c(), $$0, $$1, $$2);
   }

   public hql a() {
      return this.h.get();
   }

   private hql c() {
      if (!this.c.E()) {
         return hql.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hql.a;
         } else {
            CompletableFuture<Optional<hqk>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hqk>>>map(hqn::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || frd.Q().C()) {
                  hqp.a $$4 = hqp.a();
                  $$4.a(this.e);
                  $$4.a(hqo.m, Instant.now());
                  $$4.a(hqo.l, $$2.d());
                  $$3.accept($$4);
                  hqi $$5 = new hqi($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hqk)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hqn::close));
   }
}
