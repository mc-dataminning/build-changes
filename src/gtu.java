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

public class gtu implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffa c;
   private final UserApiService d;
   private final guc e;
   private final Path f;
   private final CompletableFuture<Optional<gua>> g;
   private final Supplier<gty> h = Suppliers.memoize(this::c);

   public gtu(ffa $$0, UserApiService $$1, ffo $$2) {
      this.c = $$0;
      this.d = $$1;
      guc.a $$3 = guc.a();
      $$2.f().ifPresent($$1x -> $$3.a(gub.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gub.b, $$1x));
      $$3.a(gub.c, UUID.randomUUID());
      $$3.a(gub.d, aa.b().b());
      $$3.a(gub.e, ac.k().a());
      $$3.a(gub.f, System.getProperty("os.name"));
      $$3.a(gub.g, ffa.e().a());
      $$3.b(gub.h, ffa.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gua.a(this.f);
   }

   public gud a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gud(this.c(), $$0, $$1, $$2);
   }

   public gty a() {
      return this.h.get();
   }

   private gty c() {
      if (!this.c.E()) {
         return gty.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gty.a;
         } else {
            CompletableFuture<Optional<gtx>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gtx>>>map(gua::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffa.Q().C()) {
                  guc.a $$4 = guc.a();
                  $$4.a(this.e);
                  $$4.a(gub.m, Instant.now());
                  $$4.a(gub.l, $$2.d());
                  $$3.accept($$4);
                  gtv $$5 = new gtv($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gtx)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gua::close));
   }
}
