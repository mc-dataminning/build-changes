import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gga {
   private static final gga.a a = new gga.a();
   private static final gga.a b = new gga.a();
   private static final gga.a c = new gga.a();
   private CompletableFuture<hfq<cxo>> d = CompletableFuture.completedFuture(hfq.empty());
   private CompletableFuture<hfq<cxo>> e = CompletableFuture.completedFuture(hfq.empty());
   private CompletableFuture<hfq<fxx>> f = CompletableFuture.completedFuture(hfq.empty());
   private final Map<gga.a, Runnable> g = new IdentityHashMap<>();

   private void a(gga.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cxo> $$0, cxk.b $$1, czg $$2) {
      return $$0.<xv>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(flp $$0, dhh $$1) {
      this.a(
         a,
         () -> {
            List<fxx> $$2 = $$0.d();
            ke $$3 = $$1.K_();
            kd<cxk> $$4 = $$3.e(mb.K);
            cxk.b $$5 = cxk.b.a($$3);
            bbp $$6 = ddp.a($$1);
            czg $$7 = czg.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hfl<>(
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

   public hfq<fxx> b() {
      return this.f.join();
   }

   public void a(List<cxo> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hfm<>($$0xxx -> $$0xxx.j().map(ayk::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hfq<cxo> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cxo> $$1) {
      this.a(
         b,
         () -> {
            cxk.b $$2 = cxk.b.a($$0);
            czg $$3 = czg.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hfl<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(aly::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hfq<cxo> d() {
      return this.d.join();
   }

   static class a {
   }
}
