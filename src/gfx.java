import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gfx {
   private static final gfx.a a = new gfx.a();
   private static final gfx.a b = new gfx.a();
   private static final gfx.a c = new gfx.a();
   private CompletableFuture<hfn<cxg>> d = CompletableFuture.completedFuture(hfn.empty());
   private CompletableFuture<hfn<cxg>> e = CompletableFuture.completedFuture(hfn.empty());
   private CompletableFuture<hfn<fxs>> f = CompletableFuture.completedFuture(hfn.empty());
   private final Map<gfx.a, Runnable> g = new IdentityHashMap<>();

   private void a(gfx.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cxg> $$0, cxc.b $$1, cyy $$2) {
      return $$0.<xk>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(flk $$0, dgz $$1) {
      this.a(
         a,
         () -> {
            List<fxs> $$2 = $$0.d();
            ke $$3 = $$1.K_();
            kd<cxc> $$4 = $$3.e(mb.K);
            cxc.b $$5 = cxc.b.a($$3);
            bbf $$6 = ddh.a($$1);
            cyy $$7 = cyy.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hfi<>(
                     $$3xx -> a($$3xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()), $$5, $$7),
                     $$2xx -> $$2xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()).map($$1xxxx -> $$4.b($$1xxxx.h())),
                     $$2
                  ),
               ae.g()
            );
            $$8.cancel(true);
         }
      );
   }

   public hfn<fxs> b() {
      return this.f.join();
   }

   public void a(List<cxg> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hfj<>($$0xxx -> $$0xxx.j().map(aya::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hfn<cxg> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cxg> $$1) {
      this.a(
         b,
         () -> {
            cxc.b $$2 = cxc.b.a($$0);
            cyy $$3 = cyy.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hfi<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alo::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hfn<cxg> d() {
      return this.d.join();
   }

   static class a {
   }
}
