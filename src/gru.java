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

public class gru implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fde c;
   private final UserApiService d;
   private final gsc e;
   private final Path f;
   private final CompletableFuture<Optional<gsa>> g;
   private final Supplier<gry> h = Suppliers.memoize(this::c);

   public gru(fde $$0, UserApiService $$1, fdt $$2) {
      this.c = $$0;
      this.d = $$1;
      gsc.a $$3 = gsc.a();
      $$2.f().ifPresent($$1x -> $$3.a(gsb.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gsb.b, $$1x));
      $$3.a(gsb.c, UUID.randomUUID());
      $$3.a(gsb.d, aa.b().b());
      $$3.a(gsb.e, ac.j().a());
      $$3.a(gsb.f, System.getProperty("os.name"));
      $$3.a(gsb.g, fde.e().a());
      $$3.b(gsb.h, fde.bg());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gsa.a(this.f);
   }

   public gsd a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gsd(this.c(), $$0, $$1, $$2);
   }

   public gry a() {
      return this.h.get();
   }

   private gry c() {
      if (!this.c.E()) {
         return gry.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gry.a;
         } else {
            CompletableFuture<Optional<grx>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<grx>>>map(gsa::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fde.Q().C()) {
                  gsc.a $$4 = gsc.a();
                  $$4.a(this.e);
                  $$4.a(gsb.m, Instant.now());
                  $$4.a(gsb.l, $$2.d());
                  $$3.accept($$4);
                  grv $$5 = new grv($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((grx)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gsa::close));
   }
}
