import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gmg {
   private static final gmg.a a = new gmg.a();
   private static final gmg.a b = new gmg.a();
   private static final gmg.a c = new gmg.a();
   private CompletableFuture<hox<dak>> d = CompletableFuture.completedFuture(hox.empty());
   private CompletableFuture<hox<dak>> e = CompletableFuture.completedFuture(hox.empty());
   private CompletableFuture<hox<gdt>> f = CompletableFuture.completedFuture(hox.empty());
   private final Map<gmg.a, Runnable> g = new IdentityHashMap<>();

   private void a(gmg.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<dak> $$0, dag.b $$1, dbz $$2) {
      return $$0.<xg>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> o.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fqb $$0, dkj $$1) {
      this.a(
         a,
         () -> {
            List<gdt> $$2 = $$0.d();
            ju $$3 = $$1.J_();
            jt<dag> $$4 = $$3.f(mi.K);
            dag.b $$5 = dag.b.a($$3);
            bbm $$6 = dgo.a($$1);
            dbz $$7 = dbz.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hos<>(
                     $$3xx -> a($$3xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()), $$5, $$7),
                     $$2xx -> $$2xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()).map($$1xxxx -> $$4.b($$1xxxx.h())),
                     $$2
                  ),
               ag.h()
            );
            $$8.cancel(true);
         }
      );
   }

   public hox<gdt> b() {
      return this.f.join();
   }

   public void a(List<dak> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hot<>($$0xxx -> $$0xxx.j().map(ayc::b), $$0), ag.h());
         $$1.cancel(true);
      });
   }

   public hox<dak> c() {
      return this.e.join();
   }

   public void a(ji.a $$0, List<dak> $$1) {
      this.a(
         b,
         () -> {
            dag.b $$2 = dag.b.a($$0);
            dbz $$3 = dbz.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hos<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alq::a).stream(), $$1), ag.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hox<dak> d() {
      return this.d.join();
   }

   static class a {
   }
}
