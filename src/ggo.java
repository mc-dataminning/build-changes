import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ggo {
   private static final ggo.a a = new ggo.a();
   private static final ggo.a b = new ggo.a();
   private static final ggo.a c = new ggo.a();
   private CompletableFuture<hit<cwn>> d = CompletableFuture.completedFuture(hit.empty());
   private CompletableFuture<hit<cwn>> e = CompletableFuture.completedFuture(hit.empty());
   private CompletableFuture<hit<fyj>> f = CompletableFuture.completedFuture(hit.empty());
   private final Map<ggo.a, Runnable> g = new IdentityHashMap<>();

   private void a(ggo.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwn> $$0, cwj.b $$1, cyf $$2) {
      return $$0.<wo>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fks $$0, dgg $$1) {
      this.a(
         a,
         () -> {
            List<fyj> $$2 = $$0.d();
            kf $$3 = $$1.K_();
            ke<cwj> $$4 = $$3.e(mc.K);
            cwj.b $$5 = cwj.b.a($$3);
            baj $$6 = dco.a($$1);
            cyf $$7 = cyf.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hio<>(
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

   public hit<fyj> b() {
      return this.f.join();
   }

   public void a(List<cwn> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hip<>($$0xxx -> $$0xxx.j().map(axe::b), $$0), af.g());
         $$1.cancel(true);
      });
   }

   public hit<cwn> c() {
      return this.e.join();
   }

   public void a(jt.a $$0, List<cwn> $$1) {
      this.a(
         b,
         () -> {
            cwj.b $$2 = cwj.b.a($$0);
            cyf $$3 = cyf.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hio<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(akt::a).stream(), $$1), af.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hit<cwn> d() {
      return this.d.join();
   }

   static class a {
   }
}
