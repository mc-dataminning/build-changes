import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ggc {
   private static final ggc.a a = new ggc.a();
   private static final ggc.a b = new ggc.a();
   private static final ggc.a c = new ggc.a();
   private CompletableFuture<hfs<cxp>> d = CompletableFuture.completedFuture(hfs.empty());
   private CompletableFuture<hfs<cxp>> e = CompletableFuture.completedFuture(hfs.empty());
   private CompletableFuture<hfs<fxz>> f = CompletableFuture.completedFuture(hfs.empty());
   private final Map<ggc.a, Runnable> g = new IdentityHashMap<>();

   private void a(ggc.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cxp> $$0, cxl.b $$1, czh $$2) {
      return $$0.<xv>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(flr $$0, dhi $$1) {
      this.a(
         a,
         () -> {
            List<fxz> $$2 = $$0.d();
            ke $$3 = $$1.K_();
            kd<cxl> $$4 = $$3.e(mb.K);
            cxl.b $$5 = cxl.b.a($$3);
            bbp $$6 = ddq.a($$1);
            czh $$7 = czh.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hfn<>(
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

   public hfs<fxz> b() {
      return this.f.join();
   }

   public void a(List<cxp> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hfo<>($$0xxx -> $$0xxx.j().map(ayk::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hfs<cxp> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cxp> $$1) {
      this.a(
         b,
         () -> {
            cxl.b $$2 = cxl.b.a($$0);
            czh $$3 = czh.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hfn<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(aly::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hfs<cxp> d() {
      return this.d.join();
   }

   static class a {
   }
}
