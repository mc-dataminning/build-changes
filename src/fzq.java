import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class fzq {
   private static final fzq.a a = new fzq.a();
   private static final fzq.a b = new fzq.a();
   private static final fzq.a c = new fzq.a();
   private CompletableFuture<gud<cuo>> d = CompletableFuture.completedFuture(gud.empty());
   private CompletableFuture<gud<cuo>> e = CompletableFuture.completedFuture(gud.empty());
   private CompletableFuture<gud<fry>> f = CompletableFuture.completedFuture(gud.empty());
   private final Map<fzq.a, Runnable> g = new IdentityHashMap<>();

   private void a(fzq.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cuo> $$0, cuj.b $$1, cwk $$2) {
      return $$0.<wy>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ffu $$0, ka.b $$1) {
      this.a(
         a,
         () -> {
            List<fry> $$2 = $$0.b();
            jz<cuj> $$3 = $$1.d(lu.K);
            cuj.b $$4 = cuj.b.a($$1);
            cwk $$5 = cwk.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new gty<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).g())),
                     $$2
                  ),
               ad.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public gud<fry> b() {
      return this.f.join();
   }

   public void a(List<cuo> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new gtz<>($$0xxx -> $$0xxx.i().map(awt::b), $$0), ad.g());
         $$1.cancel(true);
      });
   }

   public gud<cuo> c() {
      return this.e.join();
   }

   public void a(jo.a $$0, List<cuo> $$1) {
      this.a(
         b,
         () -> {
            cuj.b $$2 = cuj.b.a($$0);
            cwk $$3 = cwk.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new gty<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.h().e().map(akp::a).stream(), $$1), ad.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public gud<cuo> d() {
      return this.d.join();
   }

   static class a {
   }
}
