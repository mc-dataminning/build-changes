import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ggq {
   private static final ggq.a a = new ggq.a();
   private static final ggq.a b = new ggq.a();
   private static final ggq.a c = new ggq.a();
   private CompletableFuture<hiy<cwo>> d = CompletableFuture.completedFuture(hiy.empty());
   private CompletableFuture<hiy<cwo>> e = CompletableFuture.completedFuture(hiy.empty());
   private CompletableFuture<hiy<fyl>> f = CompletableFuture.completedFuture(hiy.empty());
   private final Map<ggq.a, Runnable> g = new IdentityHashMap<>();

   private void a(ggq.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwo> $$0, cwk.b $$1, cyg $$2) {
      return $$0.<wp>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fkt $$0, dgh $$1) {
      this.a(
         a,
         () -> {
            List<fyl> $$2 = $$0.d();
            kf $$3 = $$1.K_();
            ke<cwk> $$4 = $$3.e(mc.K);
            cwk.b $$5 = cwk.b.a($$3);
            bak $$6 = dcp.a($$1);
            cyg $$7 = cyg.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hit<>(
                     $$3xx -> a($$3xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()), $$5, $$7),
                     $$2xx -> $$2xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()).map($$1xxxx -> $$4.b($$1xxxx.h())),
                     $$2
                  ),
               af.g()
            );
            $$8.cancel(true);
         }
      );
   }

   public hiy<fyl> b() {
      return this.f.join();
   }

   public void a(List<cwo> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hiu<>($$0xxx -> $$0xxx.j().map(axf::b), $$0), af.g());
         $$1.cancel(true);
      });
   }

   public hiy<cwo> c() {
      return this.e.join();
   }

   public void a(jt.a $$0, List<cwo> $$1) {
      this.a(
         b,
         () -> {
            cwk.b $$2 = cwk.b.a($$0);
            cyg $$3 = cyg.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hit<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(aku::a).stream(), $$1), af.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hiy<cwo> d() {
      return this.d.join();
   }

   static class a {
   }
}
