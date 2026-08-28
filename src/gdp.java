import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gdp {
   private static final gdp.a a = new gdp.a();
   private static final gdp.a b = new gdp.a();
   private static final gdp.a c = new gdp.a();
   private CompletableFuture<hda<cwf>> d = CompletableFuture.completedFuture(hda.empty());
   private CompletableFuture<hda<cwf>> e = CompletableFuture.completedFuture(hda.empty());
   private CompletableFuture<hda<fvp>> f = CompletableFuture.completedFuture(hda.empty());
   private final Map<gdp.a, Runnable> g = new IdentityHashMap<>();

   private void a(gdp.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwf> $$0, cwb.b $$1, cxx $$2) {
      return $$0.<xl>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fji $$0, ke.b $$1) {
      this.a(
         a,
         () -> {
            List<fvp> $$2 = $$0.b();
            kd<cwb> $$3 = $$1.e(ma.K);
            cwb.b $$4 = cwb.b.a($$1);
            cxx $$5 = cxx.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hcv<>(
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

   public hda<fvp> b() {
      return this.f.join();
   }

   public void a(List<cwf> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hcw<>($$0xxx -> $$0xxx.j().map(axt::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hda<cwf> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cwf> $$1) {
      this.a(
         b,
         () -> {
            cwb.b $$2 = cwb.b.a($$0);
            cxx $$3 = cxx.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hcv<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alk::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hda<cwf> d() {
      return this.d.join();
   }

   static class a {
   }
}
