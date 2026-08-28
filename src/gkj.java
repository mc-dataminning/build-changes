import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gkj {
   private static final gkj.a a = new gkj.a();
   private static final gkj.a b = new gkj.a();
   private static final gkj.a c = new gkj.a();
   private CompletableFuture<hmw<cyy>> d = CompletableFuture.completedFuture(hmw.empty());
   private CompletableFuture<hmw<cyy>> e = CompletableFuture.completedFuture(hmw.empty());
   private CompletableFuture<hmw<gbx>> f = CompletableFuture.completedFuture(hmw.empty());
   private final Map<gkj.a, Runnable> g = new IdentityHashMap<>();

   private void a(gkj.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cyy> $$0, cyu.b $$1, dan $$2) {
      return $$0.<wy>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(foc $$0, div $$1) {
      this.a(
         a,
         () -> {
            List<gbx> $$2 = $$0.d();
            js $$3 = $$1.F_();
            jr<cyu> $$4 = $$3.f(mg.K);
            cyu.b $$5 = cyu.b.a($$3);
            baz $$6 = dfc.a($$1);
            dan $$7 = dan.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hmr<>(
                     $$3xx -> a($$3xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()), $$5, $$7),
                     $$2xx -> $$2xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()).map($$1xxxx -> $$4.b($$1xxxx.h())),
                     $$2
                  ),
               af.h()
            );
            $$8.cancel(true);
         }
      );
   }

   public hmw<gbx> b() {
      return this.f.join();
   }

   public void a(List<cyy> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hms<>($$0xxx -> $$0xxx.j().map(axr::b), $$0), af.h());
         $$1.cancel(true);
      });
   }

   public hmw<cyy> c() {
      return this.e.join();
   }

   public void a(jg.a $$0, List<cyy> $$1) {
      this.a(
         b,
         () -> {
            cyu.b $$2 = cyu.b.a($$0);
            dan $$3 = dan.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hmr<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alf::a).stream(), $$1), af.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hmw<cyy> d() {
      return this.d.join();
   }

   static class a {
   }
}
