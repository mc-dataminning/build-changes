import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gmt {
   private static final gmt.a a = new gmt.a();
   private static final gmt.a b = new gmt.a();
   private static final gmt.a c = new gmt.a();
   private CompletableFuture<hph<czy>> d = CompletableFuture.completedFuture(hph.empty());
   private CompletableFuture<hph<czy>> e = CompletableFuture.completedFuture(hph.empty());
   private CompletableFuture<hph<geg>> f = CompletableFuture.completedFuture(hph.empty());
   private final Map<gmt.a, Runnable> g = new IdentityHashMap<>();

   private void a(gmt.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<czy> $$0, czu.b $$1, dbn $$2) {
      return $$0.<xa>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> o.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fqo $$0, djx $$1) {
      this.a(
         a,
         () -> {
            List<geg> $$2 = $$0.d();
            jt $$3 = $$1.J_();
            js<czu> $$4 = $$3.f(mh.K);
            czu.b $$5 = czu.b.a($$3);
            bbb $$6 = dgc.a($$1);
            dbn $$7 = dbn.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hpc<>(
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

   public hph<geg> b() {
      return this.f.join();
   }

   public void a(List<czy> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hpd<>($$0xxx -> $$0xxx.j().map(axt::b), $$0), ag.h());
         $$1.cancel(true);
      });
   }

   public hph<czy> c() {
      return this.e.join();
   }

   public void a(jh.a $$0, List<czy> $$1) {
      this.a(
         b,
         () -> {
            czu.b $$2 = czu.b.a($$0);
            dbn $$3 = dbn.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hpc<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alh::a).stream(), $$1), ag.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hph<czy> d() {
      return this.d.join();
   }

   static class a {
   }
}
