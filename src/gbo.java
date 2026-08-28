import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gbo {
   private static final gbo.a a = new gbo.a();
   private static final gbo.a b = new gbo.a();
   private static final gbo.a c = new gbo.a();
   private CompletableFuture<hao<cvl>> d = CompletableFuture.completedFuture(hao.empty());
   private CompletableFuture<hao<cvl>> e = CompletableFuture.completedFuture(hao.empty());
   private CompletableFuture<hao<ftt>> f = CompletableFuture.completedFuture(hao.empty());
   private final Map<gbo.a, Runnable> g = new IdentityHashMap<>();

   private void a(gbo.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cvl> $$0, cvg.b $$1, cxf $$2) {
      return $$0.<xd>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fhm $$0, kb.b $$1) {
      this.a(
         a,
         () -> {
            List<ftt> $$2 = $$0.b();
            ka<cvg> $$3 = $$1.d(lv.K);
            cvg.b $$4 = cvg.b.a($$1);
            cxf $$5 = cxf.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new haj<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).h())),
                     $$2
                  ),
               ad.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public hao<ftt> b() {
      return this.f.join();
   }

   public void a(List<cvl> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hak<>($$0xxx -> $$0xxx.j().map(axi::b), $$0), ad.g());
         $$1.cancel(true);
      });
   }

   public hao<cvl> c() {
      return this.e.join();
   }

   public void a(jp.a $$0, List<cvl> $$1) {
      this.a(
         b,
         () -> {
            cvg.b $$2 = cvg.b.a($$0);
            cxf $$3 = cxf.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new haj<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(ala::a).stream(), $$1), ad.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hao<cvl> d() {
      return this.d.join();
   }

   static class a {
   }
}
