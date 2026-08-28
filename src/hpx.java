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

public class hpx implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fqq c;
   private final UserApiService d;
   private final hqf e;
   private final Path f;
   private final CompletableFuture<Optional<hqd>> g;
   private final Supplier<hqb> h = Suppliers.memoize(this::c);

   public hpx(fqq $$0, UserApiService $$1, frc $$2) {
      this.c = $$0;
      this.d = $$1;
      hqf.a $$3 = hqf.a();
      $$2.f().ifPresent($$1x -> $$3.a(hqe.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hqe.b, $$1x));
      $$3.a(hqe.c, UUID.randomUUID());
      $$3.a(hqe.d, ac.b().b());
      $$3.a(hqe.e, ag.n().a());
      $$3.a(hqe.f, System.getProperty("os.name"));
      $$3.a(hqe.g, fqq.e().a());
      $$3.b(hqe.h, fqq.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hqd.a(this.f);
   }

   public hqg a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hqg(this.c(), $$0, $$1, $$2);
   }

   public hqb a() {
      return this.h.get();
   }

   private hqb c() {
      if (!this.c.E()) {
         return hqb.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hqb.a;
         } else {
            CompletableFuture<Optional<hqa>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hqa>>>map(hqd::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fqq.Q().C()) {
                  hqf.a $$4 = hqf.a();
                  $$4.a(this.e);
                  $$4.a(hqe.m, Instant.now());
                  $$4.a(hqe.l, $$2.d());
                  $$3.accept($$4);
                  hpy $$5 = new hpy($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hqa)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hqd::close));
   }
}
