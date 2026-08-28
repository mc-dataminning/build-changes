import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gco {
   private static final gco.a a = new gco.a();
   private static final gco.a b = new gco.a();
   private static final gco.a c = new gco.a();
   private CompletableFuture<hbz<cvx>> d = CompletableFuture.completedFuture(hbz.empty());
   private CompletableFuture<hbz<cvx>> e = CompletableFuture.completedFuture(hbz.empty());
   private CompletableFuture<hbz<fus>> f = CompletableFuture.completedFuture(hbz.empty());
   private final Map<gco.a, Runnable> g = new IdentityHashMap<>();

   private void a(gco.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cvx> $$0, cvt.b $$1, cxp $$2) {
      return $$0.<xh>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fil $$0, kd.b $$1) {
      this.a(
         a,
         () -> {
            List<fus> $$2 = $$0.b();
            kc<cvt> $$3 = $$1.e(ly.K);
            cvt.b $$4 = cvt.b.a($$1);
            cxp $$5 = cxp.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hbu<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).h())),
                     $$2
                  ),
               ad.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public hbz<fus> b() {
      return this.f.join();
   }

   public void a(List<cvx> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hbv<>($$0xxx -> $$0xxx.j().map(axp::b), $$0), ad.g());
         $$1.cancel(true);
      });
   }

   public hbz<cvx> c() {
      return this.e.join();
   }

   public void a(jr.a $$0, List<cvx> $$1) {
      this.a(
         b,
         () -> {
            cvt.b $$2 = cvt.b.a($$0);
            cxp $$3 = cxp.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hbu<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alg::a).stream(), $$1), ad.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hbz<cvx> d() {
      return this.d.join();
   }

   static class a {
   }
}
