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

public class gie implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gim d;
   private final Path e;
   private final CompletableFuture<Optional<gik>> f;
   private final Supplier<gii> g = Suppliers.memoize(this::c);

   public gie(euk $$0, UserApiService $$1, euz $$2) {
      this.c = $$1;
      gim.a $$3 = gim.a();
      $$2.f().ifPresent($$1x -> $$3.a(gil.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gil.b, $$1x));
      $$3.a(gil.c, UUID.randomUUID());
      $$3.a(gil.d, aa.b().b());
      $$3.a(gil.e, ac.i().a());
      $$3.a(gil.f, System.getProperty("os.name"));
      $$3.a(gil.g, euk.e().a());
      $$3.b(gil.h, euk.bb());
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gik.a(this.e);
   }

   public gin a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gin(this.c(), $$0, $$1, $$2);
   }

   public gii a() {
      return this.g.get();
   }

   private gii c() {
      if (aa.aW) {
         return gii.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gii.a;
         } else {
            CompletableFuture<Optional<gih>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gih>>>map(gik::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || euk.N().z()) {
                  gim.a $$4 = gim.a();
                  $$4.a(this.d);
                  $$4.a(gil.m, Instant.now());
                  $$4.a(gil.l, $$2.d());
                  $$3.accept($$4);
                  gif $$5 = new gif($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gih)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gik::close));
   }
}
