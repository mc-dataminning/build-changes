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

public class gvu implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fgj c;
   private final UserApiService d;
   private final gwc e;
   private final Path f;
   private final CompletableFuture<Optional<gwa>> g;
   private final Supplier<gvy> h = Suppliers.memoize(this::c);

   public gvu(fgj $$0, UserApiService $$1, fgy $$2) {
      this.c = $$0;
      this.d = $$1;
      gwc.a $$3 = gwc.a();
      $$2.f().ifPresent($$1x -> $$3.a(gwb.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gwb.b, $$1x));
      $$3.a(gwb.c, UUID.randomUUID());
      $$3.a(gwb.d, ab.b().b());
      $$3.a(gwb.e, ad.j().a());
      $$3.a(gwb.f, System.getProperty("os.name"));
      $$3.a(gwb.g, fgj.e().a());
      $$3.b(gwb.h, fgj.bg());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gwa.a(this.f);
   }

   public gwd a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gwd(this.c(), $$0, $$1, $$2);
   }

   public gvy a() {
      return this.h.get();
   }

   private gvy c() {
      if (!this.c.E()) {
         return gvy.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gvy.a;
         } else {
            CompletableFuture<Optional<gvx>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gvx>>>map(gwa::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fgj.Q().C()) {
                  gwc.a $$4 = gwc.a();
                  $$4.a(this.e);
                  $$4.a(gwb.m, Instant.now());
                  $$4.a(gwb.l, $$2.d());
                  $$3.accept($$4);
                  gvv $$5 = new gvv($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gvx)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gwa::close));
   }
}
