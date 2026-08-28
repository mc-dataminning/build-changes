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

public class guf implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffn c;
   private final UserApiService d;
   private final gun e;
   private final Path f;
   private final CompletableFuture<Optional<gul>> g;
   private final Supplier<guj> h = Suppliers.memoize(this::c);

   public guf(ffn $$0, UserApiService $$1, fgb $$2) {
      this.c = $$0;
      this.d = $$1;
      gun.a $$3 = gun.a();
      $$2.f().ifPresent($$1x -> $$3.a(gum.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gum.b, $$1x));
      $$3.a(gum.c, UUID.randomUUID());
      $$3.a(gum.d, aa.b().b());
      $$3.a(gum.e, ac.k().a());
      $$3.a(gum.f, System.getProperty("os.name"));
      $$3.a(gum.g, ffn.e().a());
      $$3.b(gum.h, ffn.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gul.a(this.f);
   }

   public guo a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new guo(this.c(), $$0, $$1, $$2);
   }

   public guj a() {
      return this.h.get();
   }

   private guj c() {
      if (!this.c.E()) {
         return guj.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return guj.a;
         } else {
            CompletableFuture<Optional<gui>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gui>>>map(gul::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffn.Q().C()) {
                  gun.a $$4 = gun.a();
                  $$4.a(this.e);
                  $$4.a(gum.m, Instant.now());
                  $$4.a(gum.l, $$2.d());
                  $$3.accept($$4);
                  gug $$5 = new gug($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gui)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gul::close));
   }
}
