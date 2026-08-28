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

public class gua implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffg c;
   private final UserApiService d;
   private final gui e;
   private final Path f;
   private final CompletableFuture<Optional<gug>> g;
   private final Supplier<gue> h = Suppliers.memoize(this::c);

   public gua(ffg $$0, UserApiService $$1, ffu $$2) {
      this.c = $$0;
      this.d = $$1;
      gui.a $$3 = gui.a();
      $$2.f().ifPresent($$1x -> $$3.a(guh.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(guh.b, $$1x));
      $$3.a(guh.c, UUID.randomUUID());
      $$3.a(guh.d, aa.b().b());
      $$3.a(guh.e, ac.k().a());
      $$3.a(guh.f, System.getProperty("os.name"));
      $$3.a(guh.g, ffg.e().a());
      $$3.b(guh.h, ffg.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gug.a(this.f);
   }

   public guj a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new guj(this.c(), $$0, $$1, $$2);
   }

   public gue a() {
      return this.h.get();
   }

   private gue c() {
      if (!this.c.E()) {
         return gue.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gue.a;
         } else {
            CompletableFuture<Optional<gud>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gud>>>map(gug::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffg.Q().C()) {
                  gui.a $$4 = gui.a();
                  $$4.a(this.e);
                  $$4.a(guh.m, Instant.now());
                  $$4.a(guh.l, $$2.d());
                  $$3.accept($$4);
                  gub $$5 = new gub($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gud)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gug::close));
   }
}
