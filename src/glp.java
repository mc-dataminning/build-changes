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

public class glp implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final exh c;
   private final UserApiService d;
   private final glx e;
   private final Path f;
   private final CompletableFuture<Optional<glv>> g;
   private final Supplier<glt> h = Suppliers.memoize(this::c);

   public glp(exh $$0, UserApiService $$1, exw $$2) {
      this.c = $$0;
      this.d = $$1;
      glx.a $$3 = glx.a();
      $$2.f().ifPresent($$1x -> $$3.a(glw.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(glw.b, $$1x));
      $$3.a(glw.c, UUID.randomUUID());
      $$3.a(glw.d, aa.b().b());
      $$3.a(glw.e, ac.j().a());
      $$3.a(glw.f, System.getProperty("os.name"));
      $$3.a(glw.g, exh.e().a());
      $$3.b(glw.h, exh.bd());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = glv.a(this.f);
   }

   public gly a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gly(this.c(), $$0, $$1, $$2);
   }

   public glt a() {
      return this.h.get();
   }

   private glt c() {
      if (!this.c.C()) {
         return glt.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return glt.a;
         } else {
            CompletableFuture<Optional<gls>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gls>>>map(glv::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || exh.O().A()) {
                  glx.a $$4 = glx.a();
                  $$4.a(this.e);
                  $$4.a(glw.m, Instant.now());
                  $$4.a(glw.l, $$2.d());
                  $$3.accept($$4);
                  glq $$5 = new glq($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gls)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(glv::close));
   }
}
