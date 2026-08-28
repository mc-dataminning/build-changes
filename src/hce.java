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

public class hce implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fil c;
   private final UserApiService d;
   private final hcm e;
   private final Path f;
   private final CompletableFuture<Optional<hck>> g;
   private final Supplier<hci> h = Suppliers.memoize(this::c);

   public hce(fil $$0, UserApiService $$1, fiy $$2) {
      this.c = $$0;
      this.d = $$1;
      hcm.a $$3 = hcm.a();
      $$2.f().ifPresent($$1x -> $$3.a(hcl.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hcl.b, $$1x));
      $$3.a(hcl.c, UUID.randomUUID());
      $$3.a(hcl.d, ab.b().b());
      $$3.a(hcl.e, ad.m().a());
      $$3.a(hcl.f, System.getProperty("os.name"));
      $$3.a(hcl.g, fil.e().a());
      $$3.b(hcl.h, fil.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hck.a(this.f);
   }

   public hcn a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hcn(this.c(), $$0, $$1, $$2);
   }

   public hci a() {
      return this.h.get();
   }

   private hci c() {
      if (!this.c.E()) {
         return hci.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hci.a;
         } else {
            CompletableFuture<Optional<hch>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hch>>>map(hck::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fil.Q().C()) {
                  hcm.a $$4 = hcm.a();
                  $$4.a(this.e);
                  $$4.a(hcl.m, Instant.now());
                  $$4.a(hcl.l, $$2.d());
                  $$3.accept($$4);
                  hcf $$5 = new hcf($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hch)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hck::close));
   }
}
