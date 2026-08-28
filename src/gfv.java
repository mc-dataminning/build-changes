import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gfv {
   private static final gfv.a a = new gfv.a();
   private static final gfv.a b = new gfv.a();
   private static final gfv.a c = new gfv.a();
   private CompletableFuture<hfl<cxk>> d = CompletableFuture.completedFuture(hfl.empty());
   private CompletableFuture<hfl<cxk>> e = CompletableFuture.completedFuture(hfl.empty());
   private CompletableFuture<hfl<fxs>> f = CompletableFuture.completedFuture(hfl.empty());
   private final Map<gfv.a, Runnable> g = new IdentityHashMap<>();

   private void a(gfv.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cxk> $$0, cxg.b $$1, czc $$2) {
      return $$0.<xv>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(flk $$0, dha $$1) {
      this.a(
         a,
         () -> {
            List<fxs> $$2 = $$0.c();
            ke $$3 = $$1.K_();
            kd<cxg> $$4 = $$3.e(mb.K);
            cxg.b $$5 = cxg.b.a($$3);
            ddi.f $$6 = ddi.f.a($$1);
            czc $$7 = czc.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hfg<>(
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

   public hfl<fxs> b() {
      return this.f.join();
   }

   public void a(List<cxk> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hfh<>($$0xxx -> $$0xxx.j().map(ayk::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hfl<cxk> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cxk> $$1) {
      this.a(
         b,
         () -> {
            cxg.b $$2 = cxg.b.a($$0);
            czc $$3 = czc.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hfg<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(aly::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hfl<cxk> d() {
      return this.d.join();
   }

   static class a {
   }
}
