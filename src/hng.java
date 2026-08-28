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

public class hng implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fof c;
   private final UserApiService d;
   private final hno e;
   private final Path f;
   private final CompletableFuture<Optional<hnm>> g;
   private final Supplier<hnk> h = Suppliers.memoize(this::c);

   public hng(fof $$0, UserApiService $$1, fos $$2) {
      this.c = $$0;
      this.d = $$1;
      hno.a $$3 = hno.a();
      $$2.f().ifPresent($$1x -> $$3.a(hnn.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hnn.b, $$1x));
      $$3.a(hnn.c, UUID.randomUUID());
      $$3.a(hnn.d, ab.b().b());
      $$3.a(hnn.e, af.n().a());
      $$3.a(hnn.f, System.getProperty("os.name"));
      $$3.a(hnn.g, fof.e().a());
      $$3.b(hnn.h, fof.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hnm.a(this.f);
   }

   public hnp a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hnp(this.c(), $$0, $$1, $$2);
   }

   public hnk a() {
      return this.h.get();
   }

   private hnk c() {
      if (!this.c.E()) {
         return hnk.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hnk.a;
         } else {
            CompletableFuture<Optional<hnj>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hnj>>>map(hnm::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fof.Q().C()) {
                  hno.a $$4 = hno.a();
                  $$4.a(this.e);
                  $$4.a(hnn.m, Instant.now());
                  $$4.a(hnn.l, $$2.d());
                  $$3.accept($$4);
                  hnh $$5 = new hnh($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hnj)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hnm::close));
   }
}
