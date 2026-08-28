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

public class hdj implements AutoCloseable {
   private static final AtomicInteger a = new AtomicInteger(1);
   private static final Executor b = Executors.newSingleThreadExecutor($$0 -> {
      Thread $$1 = new Thread($$0);
      $$1.setName("Telemetry-Sender-#" + a.getAndIncrement());
      return $$1;
   });
   private final fji c;
   private final UserApiService d;
   private final hdr e;
   private final Path f;
   private final CompletableFuture<Optional<hdp>> g;
   private final Supplier<hdn> h = Suppliers.memoize(this::c);

   public hdj(fji $$0, UserApiService $$1, fjv $$2) {
      this.c = $$0;
      this.d = $$1;
      hdr.a $$3 = hdr.a();
      $$2.f().ifPresent($$1x -> $$3.a(hdq.a, $$1x));
      $$2.e().ifPresent($$1x -> $$3.a(hdq.b, $$1x));
      $$3.a(hdq.c, UUID.randomUUID());
      $$3.a(hdq.d, ab.b().b());
      $$3.a(hdq.e, ae.m().a());
      $$3.a(hdq.f, System.getProperty("os.name"));
      $$3.a(hdq.g, fji.e().a());
      $$3.b(hdq.h, fji.bg());
      this.e = $$3.a();
      this.f = $$0.q.toPath().resolve("logs/telemetry");
      this.g = hdp.a(this.f);
   }

   public hds a(boolean $$0, @Nullable Duration $$1, @Nullable String $$2) {
      return new hds(this.c(), $$0, $$1, $$2);
   }

   public hdn a() {
      return this.h.get();
   }

   private hdn c() {
      if (!this.c.E()) {
         return hdn.a;
      } else {
         TelemetrySession $$0 = this.d.newTelemetrySession(b);
         if (!$$0.isEnabled()) {
            return hdn.a;
         } else {
            CompletableFuture<Optional<hdm>> $$1 = this.g
               .thenCompose($$0x -> $$0x.<CompletionStage<Optional<hdm>>>map(hdp::a).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
            return ($$2, $$3) -> {
               if (!$$2.d() || fji.Q().C()) {
                  hdr.a $$4 = hdr.a();
                  $$4.a(this.e);
                  $$4.a(hdq.m, Instant.now());
                  $$4.a(hdq.l, $$2.d());
                  $$3.accept($$4);
                  hdk $$5 = new hdk($$2, $$4.a());
                  $$1.thenAccept($$2x -> {
                     if (!$$2x.isEmpty()) {
                        ((hdm)$$2x.get()).log($$5);
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
      this.g.thenAccept($$0 -> $$0.ifPresent(hdp::close));
   }
}
