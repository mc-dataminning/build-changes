import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ggr {
   private static final ggr.a a = new ggr.a();
   private static final ggr.a b = new ggr.a();
   private static final ggr.a c = new ggr.a();
   private CompletableFuture<hiz<cwp>> d = CompletableFuture.completedFuture(hiz.empty());
   private CompletableFuture<hiz<cwp>> e = CompletableFuture.completedFuture(hiz.empty());
   private CompletableFuture<hiz<fym>> f = CompletableFuture.completedFuture(hiz.empty());
   private final Map<ggr.a, Runnable> g = new IdentityHashMap<>();

   private void a(ggr.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwp> $$0, cwl.b $$1, cyh $$2) {
      return $$0.<wp>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fku $$0, dgi $$1) {
      this.a(
         a,
         () -> {
            List<fym> $$2 = $$0.d();
            kf $$3 = $$1.K_();
            ke<cwl> $$4 = $$3.e(mc.K);
            cwl.b $$5 = cwl.b.a($$3);
            bak $$6 = dcq.a($$1);
            cyh $$7 = cyh.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hiu<>(
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

   public hiz<fym> b() {
      return this.f.join();
   }

   public void a(List<cwp> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hiv<>($$0xxx -> $$0xxx.j().map(axf::b), $$0), af.g());
         $$1.cancel(true);
      });
   }

   public hiz<cwp> c() {
      return this.e.join();
   }

   public void a(jt.a $$0, List<cwp> $$1) {
      this.a(
         b,
         () -> {
            cwl.b $$2 = cwl.b.a($$0);
            cyh $$3 = cyh.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hiu<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(aku::a).stream(), $$1), af.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hiz<cwp> d() {
      return this.d.join();
   }

   static class a {
   }
}
