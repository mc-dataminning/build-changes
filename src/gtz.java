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

public class gtz implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fff c;
   private final UserApiService d;
   private final guh e;
   private final Path f;
   private final CompletableFuture<Optional<guf>> g;
   private final Supplier<gud> h = Suppliers.memoize(this::c);

   public gtz(fff $$0, UserApiService $$1, fft $$2) {
      this.c = $$0;
      this.d = $$1;
      guh.a $$3 = guh.a();
      $$2.f().ifPresent($$1x -> $$3.a(gug.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gug.b, $$1x));
      $$3.a(gug.c, UUID.randomUUID());
      $$3.a(gug.d, aa.b().b());
      $$3.a(gug.e, ac.k().a());
      $$3.a(gug.f, System.getProperty("os.name"));
      $$3.a(gug.g, fff.e().a());
      $$3.b(gug.h, fff.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = guf.a(this.f);
   }

   public gui a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gui(this.c(), $$0, $$1, $$2);
   }

   public gud a() {
      return this.h.get();
   }

   private gud c() {
      if (!this.c.E()) {
         return gud.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gud.a;
         } else {
            CompletableFuture<Optional<guc>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<guc>>>map(guf::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fff.Q().C()) {
                  guh.a $$4 = guh.a();
                  $$4.a(this.e);
                  $$4.a(gug.m, Instant.now());
                  $$4.a(gug.l, $$2.d());
                  $$3.accept($$4);
                  gua $$5 = new gua($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((guc)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(guf::close));
   }
}
