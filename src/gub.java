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

public class gub implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final ffh c;
   private final UserApiService d;
   private final guj e;
   private final Path f;
   private final CompletableFuture<Optional<guh>> g;
   private final Supplier<guf> h = Suppliers.memoize(this::c);

   public gub(ffh $$0, UserApiService $$1, ffv $$2) {
      this.c = $$0;
      this.d = $$1;
      guj.a $$3 = guj.a();
      $$2.f().ifPresent($$1x -> $$3.a(gui.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gui.b, $$1x));
      $$3.a(gui.c, UUID.randomUUID());
      $$3.a(gui.d, aa.b().b());
      $$3.a(gui.e, ac.k().a());
      $$3.a(gui.f, System.getProperty("os.name"));
      $$3.a(gui.g, ffh.e().a());
      $$3.b(gui.h, ffh.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = guh.a(this.f);
   }

   public guk a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new guk(this.c(), $$0, $$1, $$2);
   }

   public guf a() {
      return this.h.get();
   }

   private guf c() {
      if (!this.c.E()) {
         return guf.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return guf.a;
         } else {
            CompletableFuture<Optional<gue>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gue>>>map(guh::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || ffh.Q().C()) {
                  guj.a $$4 = guj.a();
                  $$4.a(this.e);
                  $$4.a(gui.m, Instant.now());
                  $$4.a(gui.l, $$2.d());
                  $$3.accept($$4);
                  guc $$5 = new guc($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gue)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(guh::close));
   }
}
