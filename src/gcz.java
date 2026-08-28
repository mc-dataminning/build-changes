import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gcz {
   private static final gcz.a a = new gcz.a();
   private static final gcz.a b = new gcz.a();
   private static final gcz.a c = new gcz.a();
   private CompletableFuture<hck<cwb>> d = CompletableFuture.completedFuture(hck.empty());
   private CompletableFuture<hck<cwb>> e = CompletableFuture.completedFuture(hck.empty());
   private CompletableFuture<hck<fva>> f = CompletableFuture.completedFuture(hck.empty());
   private final Map<gcz.a, Runnable> g = new IdentityHashMap<>();

   private void a(gcz.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwb> $$0, cvx.b $$1, cxt $$2) {
      return $$0.<xi>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fit $$0, ke.b $$1) {
      this.a(
         a,
         () -> {
            List<fva> $$2 = $$0.b();
            kd<cvx> $$3 = $$1.e(lz.K);
            cvx.b $$4 = cvx.b.a($$1);
            cxt $$5 = cxt.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hcf<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).h())),
                     $$2
                  ),
               ae.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public hck<fva> b() {
      return this.f.join();
   }

   public void a(List<cwb> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hcg<>($$0xxx -> $$0xxx.j().map(axq::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hck<cwb> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cwb> $$1) {
      this.a(
         b,
         () -> {
            cvx.b $$2 = cvx.b.a($$0);
            cxt $$3 = cxt.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hcf<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alh::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hck<cwb> d() {
      return this.d.join();
   }

   static class a {
   }
}
