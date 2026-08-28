import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gcd {
   private static final gcd.a a = new gcd.a();
   private static final gcd.a b = new gcd.a();
   private static final gcd.a c = new gcd.a();
   private CompletableFuture<hbk<cvs>> d = CompletableFuture.completedFuture(hbk.empty());
   private CompletableFuture<hbk<cvs>> e = CompletableFuture.completedFuture(hbk.empty());
   private CompletableFuture<hbk<fuh>> f = CompletableFuture.completedFuture(hbk.empty());
   private final Map<gcd.a, Runnable> g = new IdentityHashMap<>();

   private void a(gcd.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cvs> $$0, cvn.b $$1, cxk $$2) {
      return $$0.<xe>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fia $$0, kc.b $$1) {
      this.a(
         a,
         () -> {
            List<fuh> $$2 = $$0.b();
            kb<cvn> $$3 = $$1.e(lw.K);
            cvn.b $$4 = cvn.b.a($$1);
            cxk $$5 = cxk.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hbf<>(
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

   public hbk<fuh> b() {
      return this.f.join();
   }

   public void a(List<cvs> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hbg<>($$0xxx -> $$0xxx.j().map(axl::b), $$0), ad.g());
         $$1.cancel(true);
      });
   }

   public hbk<cvs> c() {
      return this.e.join();
   }

   public void a(jq.a $$0, List<cvs> $$1) {
      this.a(
         b,
         () -> {
            cvn.b $$2 = cvn.b.a($$0);
            cxk $$3 = cxk.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hbf<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(ald::a).stream(), $$1), ad.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hbk<cvs> d() {
      return this.d.join();
   }

   static class a {
   }
}
