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

public class gdu implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gec d;
   private final Path e;
   private final CompletableFuture<Optional<gea>> f;
   private final Supplier<gdy> g = Suppliers.memoize(this::c);

   public gdu(eqv $$0, UserApiService $$1, erk $$2) {
      this.c = $$1;
      gec.a $$3 = gec.a();
      $$2.f().ifPresent($$1x -> $$3.a(geb.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(geb.b, $$1x));
      $$3.a(geb.c, UUID.randomUUID());
      $$3.a(geb.d, aa.b().b());
      $$3.a(geb.e, ac.i().a());
      $$3.a(geb.f, System.getProperty("os.name"));
      $$3.a(geb.g, eqv.e().a());
      $$3.b(geb.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gea.a(this.e);
   }

   public ged a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new ged(this.c(), $$0, $$1, $$2);
   }

   public gdy a() {
      return this.g.get();
   }

   private gdy c() {
      if (aa.aT) {
         return gdy.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gdy.a;
         } else {
            CompletableFuture<Optional<gdx>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gdx>>>map(gea::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eqv.O().A()) {
                  gec.a $$4 = gec.a();
                  $$4.a(this.d);
                  $$4.a(geb.m, Instant.now());
                  $$4.a(geb.l, $$2.d());
                  $$3.accept($$4);
                  gdv $$5 = new gdv($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gdx)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gea::close));
   }
}
