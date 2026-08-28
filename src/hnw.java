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

public class hnw implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fos c;
   private final UserApiService d;
   private final hoe e;
   private final Path f;
   private final CompletableFuture<Optional<hoc>> g;
   private final Supplier<hoa> h = Suppliers.memoize(this::c);

   public hnw(fos $$0, UserApiService $$1, fpe $$2) {
      this.c = $$0;
      this.d = $$1;
      hoe.a $$3 = hoe.a();
      $$2.f().ifPresent($$1x -> $$3.a(hod.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hod.b, $$1x));
      $$3.a(hod.c, UUID.randomUUID());
      $$3.a(hod.d, ab.b().b());
      $$3.a(hod.e, af.n().a());
      $$3.a(hod.f, System.getProperty("os.name"));
      $$3.a(hod.g, fos.e().a());
      $$3.b(hod.h, fos.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hoc.a(this.f);
   }

   public hof a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hof(this.c(), $$0, $$1, $$2);
   }

   public hoa a() {
      return this.h.get();
   }

   private hoa c() {
      if (!this.c.E()) {
         return hoa.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hoa.a;
         } else {
            CompletableFuture<Optional<hnz>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hnz>>>map(hoc::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fos.Q().C()) {
                  hoe.a $$4 = hoe.a();
                  $$4.a(this.e);
                  $$4.a(hod.m, Instant.now());
                  $$4.a(hod.l, $$2.d());
                  $$3.accept($$4);
                  hnx $$5 = new hnx($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hnz)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hoc::close));
   }
}
