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

public class hbn implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fib c;
   private final UserApiService d;
   private final hbv e;
   private final Path f;
   private final CompletableFuture<Optional<hbt>> g;
   private final Supplier<hbr> h = Suppliers.memoize(this::c);

   public hbn(fib $$0, UserApiService $$1, fio $$2) {
      this.c = $$0;
      this.d = $$1;
      hbv.a $$3 = hbv.a();
      $$2.f().ifPresent($$1x -> $$3.a(hbu.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hbu.b, $$1x));
      $$3.a(hbu.c, UUID.randomUUID());
      $$3.a(hbu.d, ab.b().b());
      $$3.a(hbu.e, ad.m().a());
      $$3.a(hbu.f, System.getProperty("os.name"));
      $$3.a(hbu.g, fib.e().a());
      $$3.b(hbu.h, fib.bf());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hbt.a(this.f);
   }

   public hbw a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hbw(this.c(), $$0, $$1, $$2);
   }

   public hbr a() {
      return this.h.get();
   }

   private hbr c() {
      if (!this.c.E()) {
         return hbr.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hbr.a;
         } else {
            CompletableFuture<Optional<hbq>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hbq>>>map(hbt::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fib.Q().C()) {
                  hbv.a $$4 = hbv.a();
                  $$4.a(this.e);
                  $$4.a(hbu.m, Instant.now());
                  $$4.a(hbu.l, $$2.d());
                  $$3.accept($$4);
                  hbo $$5 = new hbo($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hbq)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hbt::close));
   }
}
