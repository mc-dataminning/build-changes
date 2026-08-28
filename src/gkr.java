import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gkr {
   private static final gkr.a a = new gkr.a();
   private static final gkr.a b = new gkr.a();
   private static final gkr.a c = new gkr.a();
   private CompletableFuture<hne<czd>> d = CompletableFuture.completedFuture(hne.empty());
   private CompletableFuture<hne<czd>> e = CompletableFuture.completedFuture(hne.empty());
   private CompletableFuture<hne<gce>> f = CompletableFuture.completedFuture(hne.empty());
   private final Map<gkr.a, Runnable> g = new IdentityHashMap<>();

   private void a(gkr.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<czd> $$0, cyz.b $$1, das $$2) {
      return $$0.<wy>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(foj $$0, dja $$1) {
      this.a(
         a,
         () -> {
            List<gce> $$2 = $$0.d();
            js $$3 = $$1.F_();
            jr<cyz> $$4 = $$3.f(mg.K);
            cyz.b $$5 = cyz.b.a($$3);
            baz $$6 = dfh.a($$1);
            das $$7 = das.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hmz<>(
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

   public hne<gce> b() {
      return this.f.join();
   }

   public void a(List<czd> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hna<>($$0xxx -> $$0xxx.j().map(axr::b), $$0), af.h());
         $$1.cancel(true);
      });
   }

   public hne<czd> c() {
      return this.e.join();
   }

   public void a(jg.a $$0, List<czd> $$1) {
      this.a(
         b,
         () -> {
            cyz.b $$2 = cyz.b.a($$0);
            das $$3 = das.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hmz<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alf::a).stream(), $$1), af.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hne<czd> d() {
      return this.d.join();
   }

   static class a {
   }
}
