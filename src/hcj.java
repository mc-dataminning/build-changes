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

public class hcj implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fip c;
   private final UserApiService d;
   private final hcr e;
   private final Path f;
   private final CompletableFuture<Optional<hcp>> g;
   private final Supplier<hcn> h = Suppliers.memoize(this::c);

   public hcj(fip $$0, UserApiService $$1, fjc $$2) {
      this.c = $$0;
      this.d = $$1;
      hcr.a $$3 = hcr.a();
      $$2.f().ifPresent($$1x -> $$3.a(hcq.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hcq.b, $$1x));
      $$3.a(hcq.c, UUID.randomUUID());
      $$3.a(hcq.d, ab.b().b());
      $$3.a(hcq.e, ad.m().a());
      $$3.a(hcq.f, System.getProperty("os.name"));
      $$3.a(hcq.g, fip.e().a());
      $$3.b(hcq.h, fip.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hcp.a(this.f);
   }

   public hcs a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hcs(this.c(), $$0, $$1, $$2);
   }

   public hcn a() {
      return this.h.get();
   }

   private hcn c() {
      if (!this.c.E()) {
         return hcn.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hcn.a;
         } else {
            CompletableFuture<Optional<hcm>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hcm>>>map(hcp::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fip.Q().C()) {
                  hcr.a $$4 = hcr.a();
                  $$4.a(this.e);
                  $$4.a(hcq.m, Instant.now());
                  $$4.a(hcq.l, $$2.d());
                  $$3.accept($$4);
                  hck $$5 = new hck($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hcm)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hcp::close));
   }
}
