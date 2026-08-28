import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class fza {
   private static final fza.a a = new fza.a();
   private static final fza.a b = new fza.a();
   private static final fza.a c = new fza.a();
   private CompletableFuture<gtm<cuc>> d = CompletableFuture.completedFuture(gtm.empty());
   private CompletableFuture<gtm<cuc>> e = CompletableFuture.completedFuture(gtm.empty());
   private CompletableFuture<gtm<fri>> f = CompletableFuture.completedFuture(gtm.empty());
   private final Map<fza.a, Runnable> g = new IdentityHashMap<>();

   private void a(fza.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cuc> $$0, ctx.b $$1, cvv $$2) {
      return $$0.<wu>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ffg $$0, jx.b $$1) {
      this.a(
         a,
         () -> {
            List<fri> $$2 = $$0.b();
            jw<ctx> $$3 = $$1.d(lr.K);
            ctx.b $$4 = ctx.b.a($$1);
            cvv $$5 = cvv.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new gth<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).g())),
                     $$2
                  ),
               ac.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public gtm<fri> b() {
      return this.f.join();
   }

   public void a(List<cuc> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new gti<>($$0xxx -> $$0xxx.i().map(awm::b), $$0), ac.g());
         $$1.cancel(true);
      });
   }

   public gtm<cuc> c() {
      return this.e.join();
   }

   public void a(jl.a $$0, List<cuc> $$1) {
      this.a(
         b,
         () -> {
            ctx.b $$2 = ctx.b.a($$0);
            cvv $$3 = cvv.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new gth<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.h().e().map(akj::a).stream(), $$1), ac.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public gtm<cuc> d() {
      return this.d.join();
   }

   static class a {
   }
}
