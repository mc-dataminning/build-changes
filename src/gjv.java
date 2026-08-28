import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gjv {
   private static final gjv.a a = new gjv.a();
   private static final gjv.a b = new gjv.a();
   private static final gjv.a c = new gjv.a();
   private CompletableFuture<hmg<cys>> d = CompletableFuture.completedFuture(hmg.empty());
   private CompletableFuture<hmg<cys>> e = CompletableFuture.completedFuture(hmg.empty());
   private CompletableFuture<hmg<gbl>> f = CompletableFuture.completedFuture(hmg.empty());
   private final Map<gjv.a, Runnable> g = new IdentityHashMap<>();

   private void a(gjv.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cys> $$0, cyo.b $$1, dah $$2) {
      return $$0.<ww>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fnq $$0, dip $$1) {
      this.a(
         a,
         () -> {
            List<gbl> $$2 = $$0.d();
            js $$3 = $$1.F_();
            jr<cyo> $$4 = $$3.f(mg.K);
            cyo.b $$5 = cyo.b.a($$3);
            bax $$6 = dew.a($$1);
            dah $$7 = dah.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hmb<>(
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

   public hmg<gbl> b() {
      return this.f.join();
   }

   public void a(List<cys> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hmc<>($$0xxx -> $$0xxx.j().map(axp::b), $$0), af.h());
         $$1.cancel(true);
      });
   }

   public hmg<cys> c() {
      return this.e.join();
   }

   public void a(jg.a $$0, List<cys> $$1) {
      this.a(
         b,
         () -> {
            cyo.b $$2 = cyo.b.a($$0);
            dah $$3 = dah.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hmb<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(ald::a).stream(), $$1), af.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hmg<cys> d() {
      return this.d.join();
   }

   static class a {
   }
}
