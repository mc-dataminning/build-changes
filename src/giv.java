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

public class giv implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gjd d;
   private final Path e;
   private final CompletableFuture<Optional<gjb>> f;
   private final Supplier<giz> g = Suppliers.memoize(this::c);

   public giv(eva $$0, UserApiService $$1, evp $$2) {
      this.c = $$1;
      gjd.a $$3 = gjd.a();
      $$2.f().ifPresent($$1x -> $$3.a(gjc.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gjc.b, $$1x));
      $$3.a(gjc.c, UUID.randomUUID());
      $$3.a(gjc.d, aa.b().b());
      $$3.a(gjc.e, ac.i().a());
      $$3.a(gjc.f, System.getProperty("os.name"));
      $$3.a(gjc.g, eva.e().a());
      $$3.b(gjc.h, eva.bb());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gjb.a(this.e);
   }

   public gje a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gje(this.c(), $$0, $$1, $$2);
   }

   public giz a() {
      return this.g.get();
   }

   private giz c() {
      if (aa.aW) {
         return giz.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return giz.a;
         } else {
            CompletableFuture<Optional<giy>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<giy>>>map(gjb::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eva.N().z()) {
                  gjd.a $$4 = gjd.a();
                  $$4.a(this.d);
                  $$4.a(gjc.m, Instant.now());
                  $$4.a(gjc.l, $$2.d());
                  $$3.accept($$4);
                  giw $$5 = new giw($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((giy)$$2x.get()).log($$5);
                        $$5.a($$0).send();
                     }
                  });
               }
            };
         }
      }
   }

   public Path b() {
      return this.e;
   }

   @Override
   public void close() {
      this.f.thenAccept($$0 -> $$0.ifPresent(gjb::close));
   }
}
