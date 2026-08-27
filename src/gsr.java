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

public class gsr implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final feb c;
   private final UserApiService d;
   private final gsz e;
   private final Path f;
   private final CompletableFuture<Optional<gsx>> g;
   private final Supplier<gsv> h = Suppliers.memoize(this::c);

   public gsr(feb $$0, UserApiService $$1, fep $$2) {
      this.c = $$0;
      this.d = $$1;
      gsz.a $$3 = gsz.a();
      $$2.f().ifPresent($$1x -> $$3.a(gsy.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(gsy.b, $$1x));
      $$3.a(gsy.c, UUID.randomUUID());
      $$3.a(gsy.d, aa.b().b());
      $$3.a(gsy.e, ac.k().a());
      $$3.a(gsy.f, System.getProperty("os.name"));
      $$3.a(gsy.g, feb.e().a());
      $$3.b(gsy.h, feb.be());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = gsx.a(this.f);
   }

   public gta a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new gta(this.c(), $$0, $$1, $$2);
   }

   public gsv a() {
      return this.h.get();
   }

   private gsv c() {
      if (!this.c.E()) {
         return gsv.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return gsv.a;
         } else {
            CompletableFuture<Optional<gsu>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<gsu>>>map(gsx::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || feb.Q().C()) {
                  gsz.a $$4 = gsz.a();
                  $$4.a(this.e);
                  $$4.a(gsy.m, Instant.now());
                  $$4.a(gsy.l, $$2.d());
                  $$3.accept($$4);
                  gss $$5 = new gss($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((gsu)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(gsx::close));
   }
}
