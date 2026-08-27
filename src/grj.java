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

public class grj implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fcu c;
   private final UserApiService d;
   private final grr e;
   private final Path f;
   private final CompletableFuture<Optional<grp>> g;
   private final Supplier<grn> h = Suppliers.memoize(this::c);

   public grj(fcu $$0, UserApiService $$1, fdj $$2) {
      this.c = $$0;
      this.d = $$1;
      grr.a $$3 = grr.a();
      $$2.f().ifPresent($$1x -> $$3.a(grq.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(grq.b, $$1x));
      $$3.a(grq.c, UUID.randomUUID());
      $$3.a(grq.d, aa.b().b());
      $$3.a(grq.e, ac.j().a());
      $$3.a(grq.f, System.getProperty("os.name"));
      $$3.a(grq.g, fcu.e().a());
      $$3.b(grq.h, fcu.bf());
      this.e = $$3.a();
      this.f = $$0.p.toPath().resolve("logs/telemetry");
      this.g = grp.a(this.f);
   }

   public grs a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new grs(this.c(), $$0, $$1, $$2);
   }

   public grn a() {
      return this.h.get();
   }

   private grn c() {
      if (!this.c.E()) {
         return grn.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return grn.a;
         } else {
            CompletableFuture<Optional<grm>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<grm>>>map(grp::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fcu.Q().C()) {
                  grr.a $$4 = grr.a();
                  $$4.a(this.e);
                  $$4.a(grq.m, Instant.now());
                  $$4.a(grq.l, $$2.d());
                  $$3.accept($$4);
                  grk $$5 = new grk($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((grm)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(grp::close));
   }
}
