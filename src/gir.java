import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gir {
   private static final gir.a a = new gir.a();
   private static final gir.a b = new gir.a();
   private static final gir.a c = new gir.a();
   private CompletableFuture<hkz<cxy>> d = CompletableFuture.completedFuture(hkz.empty());
   private CompletableFuture<hkz<cxy>> e = CompletableFuture.completedFuture(hkz.empty());
   private CompletableFuture<hkz<gai>> f = CompletableFuture.completedFuture(hkz.empty());
   private final Map<gir.a, Runnable> g = new IdentityHashMap<>();

   private void a(gir.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cxy> $$0, cxu.b $$1, czn $$2) {
      return $$0.<wv>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fmo $$0, dhp $$1) {
      this.a(
         a,
         () -> {
            List<gai> $$2 = $$0.d();
            kg $$3 = $$1.F_();
            kf<cxu> $$4 = $$3.f(me.K);
            cxu.b $$5 = cxu.b.a($$3);
            bav $$6 = ddy.a($$1);
            czn $$7 = czn.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hku<>(
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

   public hkz<gai> b() {
      return this.f.join();
   }

   public void a(List<cxy> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hkv<>($$0xxx -> $$0xxx.j().map(axp::b), $$0), af.h());
         $$1.cancel(true);
      });
   }

   public hkz<cxy> c() {
      return this.e.join();
   }

   public void a(ju.a $$0, List<cxy> $$1) {
      this.a(
         b,
         () -> {
            cxu.b $$2 = cxu.b.a($$0);
            czn $$3 = czn.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hku<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alc::a).stream(), $$1), af.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hkz<cxy> d() {
      return this.d.join();
   }

   static class a {
   }
}
