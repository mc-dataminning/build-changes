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

public class gdk implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final UserApiService c;
   private final gds d;
   private final Path e;
   private final CompletableFuture<Optional<gdq>> f;
   private final Supplier<gdo> g = Suppliers.memoize(this::c);

   public gdk(eql $$0, UserApiService $$1, era $$2) {
      this.c = $$1;
      gds.a $$3 = gds.a();
      $$2.f().ifPresent($$1x -> $$3.a(gdr.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gdr.b, $$1x));
      $$3.a(gdr.c, UUID.randomUUID());
      $$3.a(gdr.d, aa.b().b());
      $$3.a(gdr.e, ac.i().a());
      $$3.a(gdr.f, System.getProperty("os.name"));
      $$3.a(gdr.g, eql.e().a());
      $$3.b(gdr.h, System.getProperty("minecraft.launcher.brand"));
      this.d = $$3.a();
      this.e = $$0.p.toPath().resolve("logs/telemetry");
      this.f = gdq.a(this.e);
   }

   public gdt a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gdt(this.c(), $$0, $$1, $$2);
   }

   public gdo a() {
      return this.g.get();
   }

   private gdo c() {
      if (aa.aS) {
         return gdo.a;
      } else {
         TelemetrySession $$0 = this.c.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gdo.a;
         } else {
            CompletableFuture<Optional<gdn>> $$1 = this.f
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gdn>>>map(gdq::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || eql.O().A()) {
                  gds.a $$4 = gds.a();
                  $$4.a(this.d);
                  $$4.a(gdr.m, Instant.now());
                  $$4.a(gdr.l, $$2.d());
                  $$3.accept($$4);
                  gdl $$5 = new gdl($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gdn)$$2x.get()).log($$5);
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
      this.f.thenAccept($$0 -> $$0.ifPresent(gdq::close));
   }
}
