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

public class gul implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fft c;
   private final UserApiService d;
   private final gut e;
   private final Path f;
   private final CompletableFuture<Optional<gur>> g;
   private final Supplier<gup> h = Suppliers.memoize(this::c);

   public gul(fft $$0, UserApiService $$1, fgh $$2) {
      this.c = $$0;
      this.d = $$1;
      gut.a $$3 = gut.a();
      $$2.f().ifPresent($$1x -> $$3.a(gus.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gus.b, $$1x));
      $$3.a(gus.c, UUID.randomUUID());
      $$3.a(gus.d, aa.b().b());
      $$3.a(gus.e, ac.k().a());
      $$3.a(gus.f, System.getProperty("os.name"));
      $$3.a(gus.g, fft.e().a());
      $$3.b(gus.h, fft.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gur.a(this.f);
   }

   public guu a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new guu(this.c(), $$0, $$1, $$2);
   }

   public gup a() {
      return this.h.get();
   }

   private gup c() {
      if (!this.c.E()) {
         return gup.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gup.a;
         } else {
            CompletableFuture<Optional<guo>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<guo>>>map(gur::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fft.Q().C()) {
                  gut.a $$4 = gut.a();
                  $$4.a(this.e);
                  $$4.a(gus.m, Instant.now());
                  $$4.a(gus.l, $$2.d());
                  $$3.accept($$4);
                  gum $$5 = new gum($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((guo)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gur::close));
   }
}
