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

public class hoy implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fpt c;
   private final UserApiService d;
   private final hpg e;
   private final Path f;
   private final CompletableFuture<Optional<hpe>> g;
   private final Supplier<hpc> h = Suppliers.memoize(this::c);

   public hoy(fpt $$0, UserApiService $$1, fqf $$2) {
      this.c = $$0;
      this.d = $$1;
      hpg.a $$3 = hpg.a();
      $$2.f().ifPresent($$1x -> $$3.a(hpf.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hpf.b, $$1x));
      $$3.a(hpf.c, UUID.randomUUID());
      $$3.a(hpf.d, ac.b().b());
      $$3.a(hpf.e, ag.n().a());
      $$3.a(hpf.f, System.getProperty("os.name"));
      $$3.a(hpf.g, fpt.e().a());
      $$3.b(hpf.h, fpt.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hpe.a(this.f);
   }

   public hph a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hph(this.c(), $$0, $$1, $$2);
   }

   public hpc a() {
      return this.h.get();
   }

   private hpc c() {
      if (!this.c.E()) {
         return hpc.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hpc.a;
         } else {
            CompletableFuture<Optional<hpb>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hpb>>>map(hpe::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fpt.Q().C()) {
                  hpg.a $$4 = hpg.a();
                  $$4.a(this.e);
                  $$4.a(hpf.m, Instant.now());
                  $$4.a(hpf.l, $$2.d());
                  $$3.accept($$4);
                  hoz $$5 = new hoz($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hpb)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hpe::close));
   }
}
