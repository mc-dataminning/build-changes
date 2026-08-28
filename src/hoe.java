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

public class hoe implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final foz c;
   private final UserApiService d;
   private final hom e;
   private final Path f;
   private final CompletableFuture<Optional<hok>> g;
   private final Supplier<hoi> h = Suppliers.memoize(this::c);

   public hoe(foz $$0, UserApiService $$1, fpl $$2) {
      this.c = $$0;
      this.d = $$1;
      hom.a $$3 = hom.a();
      $$2.f().ifPresent($$1x -> $$3.a(hol.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hol.b, $$1x));
      $$3.a(hol.c, UUID.randomUUID());
      $$3.a(hol.d, ab.b().b());
      $$3.a(hol.e, af.n().a());
      $$3.a(hol.f, System.getProperty("os.name"));
      $$3.a(hol.g, foz.e().a());
      $$3.b(hol.h, foz.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hok.a(this.f);
   }

   public hon a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hon(this.c(), $$0, $$1, $$2);
   }

   public hoi a() {
      return this.h.get();
   }

   private hoi c() {
      if (!this.c.E()) {
         return hoi.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hoi.a;
         } else {
            CompletableFuture<Optional<hoh>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hoh>>>map(hok::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || foz.Q().C()) {
                  hom.a $$4 = hom.a();
                  $$4.a(this.e);
                  $$4.a(hol.m, Instant.now());
                  $$4.a(hol.l, $$2.d());
                  $$3.accept($$4);
                  hof $$5 = new hof($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hoh)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hok::close));
   }
}
