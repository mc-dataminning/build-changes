import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ghq {
   private static final ghq.a a = new ghq.a();
   private static final ghq.a b = new ghq.a();
   private static final ghq.a c = new ghq.a();
   private CompletableFuture<hjy<cxh>> d = CompletableFuture.completedFuture(hjy.empty());
   private CompletableFuture<hjy<cxh>> e = CompletableFuture.completedFuture(hjy.empty());
   private CompletableFuture<hjy<fzj>> f = CompletableFuture.completedFuture(hjy.empty());
   private final Map<ghq.a, Runnable> g = new IdentityHashMap<>();

   private void a(ghq.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cxh> $$0, cxd.b $$1, cyx $$2) {
      return $$0.<wp>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(flr $$0, dgz $$1) {
      this.a(
         a,
         () -> {
            List<fzj> $$2 = $$0.d();
            kf $$3 = $$1.F_();
            ke<cxd> $$4 = $$3.e(mc.K);
            cxd.b $$5 = cxd.b.a($$3);
            bak $$6 = ddi.a($$1);
            cyx $$7 = cyx.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hjt<>(
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

   public hjy<fzj> b() {
      return this.f.join();
   }

   public void a(List<cxh> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hju<>($$0xxx -> $$0xxx.j().map(axf::b), $$0), af.h());
         $$1.cancel(true);
      });
   }

   public hjy<cxh> c() {
      return this.e.join();
   }

   public void a(jt.a $$0, List<cxh> $$1) {
      this.a(
         b,
         () -> {
            cxd.b $$2 = cxd.b.a($$0);
            cyx $$3 = cyx.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hjt<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(akt::a).stream(), $$1), af.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hjy<cxh> d() {
      return this.d.join();
   }

   static class a {
   }
}
