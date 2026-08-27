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

public class fzg implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final fzo d;
   private final Path e;
   private final CompletableFuture<Optional<fzm>> f;
   private final Supplier<fzk> g = Suppliers.memoize(this::c);

   public fzg(enn $$0, UserApiService $$1, eoc $$2) {
      this.c = $$1;
      fzo.a $$3 = fzo.a();
      $$2.f().ifPresent($$1x -> $$3.a(fzn.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(fzn.b, $$1x));
      $$3.a(fzn.c, UUID.randomUUID());
      $$3.a(fzn.d, aa.b().b());
      $$3.a(fzn.e, ac.i().a());
      $$3.a(fzn.f, System.getProperty("os.name"));
      $$3.a(fzn.g, enn.d().a());
      $$3.b(fzn.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = fzm.a(this.e);
   }

   public fzp a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new fzp(this.c(), $$0, $$1, $$2);
   }

   public fzk a() {
      return this.g.get();
   }

   private fzk c() {
      if (aa.aS) {
         return fzk.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return fzk.a;
         } else {
            CompletableFuture<Optional<fzj>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<fzj>>>map(fzm::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || enn.N().z()) {
                  fzo.a $$4 = fzo.a();
                  $$4.a(this.d);
                  $$4.a(fzn.m, Instant.now());
                  $$4.a(fzn.l, $$2.d());
                  $$3.accept($$4);
                  fzh $$5 = new fzh($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((fzj)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(fzm::close));
   }
}
