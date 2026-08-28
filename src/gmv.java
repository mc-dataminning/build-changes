import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gmv {
   private static final gmv.a a = new gmv.a();
   private static final gmv.a b = new gmv.a();
   private static final gmv.a c = new gmv.a();
   private CompletableFuture<hpj<daa>> d = CompletableFuture.completedFuture(hpj.empty());
   private CompletableFuture<hpj<daa>> e = CompletableFuture.completedFuture(hpj.empty());
   private CompletableFuture<hpj<gei>> f = CompletableFuture.completedFuture(hpj.empty());
   private final Map<gmv.a, Runnable> g = new IdentityHashMap<>();

   private void a(gmv.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<daa> $$0, czw.b $$1, dbp $$2) {
      return $$0.<xc>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> o.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fqq $$0, djz $$1) {
      this.a(
         a,
         () -> {
            List<gei> $$2 = $$0.d();
            ju $$3 = $$1.J_();
            jt<czw> $$4 = $$3.f(mi.K);
            czw.b $$5 = czw.b.a($$3);
            bbd $$6 = dge.a($$1);
            dbp $$7 = dbp.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hpe<>(
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

   public hpj<gei> b() {
      return this.f.join();
   }

   public void a(List<daa> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hpf<>($$0xxx -> $$0xxx.j().map(axv::b), $$0), ag.h());
         $$1.cancel(true);
      });
   }

   public hpj<daa> c() {
      return this.e.join();
   }

   public void a(ji.a $$0, List<daa> $$1) {
      this.a(
         b,
         () -> {
            czw.b $$2 = czw.b.a($$0);
            dbp $$3 = dbp.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hpe<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alj::a).stream(), $$1), ag.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hpj<daa> d() {
      return this.d.join();
   }

   static class a {
   }
}
