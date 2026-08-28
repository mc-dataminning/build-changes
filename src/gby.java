import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gby {
   private static final gby.a a = new gby.a();
   private static final gby.a b = new gby.a();
   private static final gby.a c = new gby.a();
   private CompletableFuture<hbf<cvp>> d = CompletableFuture.completedFuture(hbf.empty());
   private CompletableFuture<hbf<cvp>> e = CompletableFuture.completedFuture(hbf.empty());
   private CompletableFuture<hbf<fud>> f = CompletableFuture.completedFuture(hbf.empty());
   private final Map<gby.a, Runnable> g = new IdentityHashMap<>();

   private void a(gby.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cvp> $$0, cvk.b $$1, cxh $$2) {
      return $$0.<xd>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fhw $$0, kb.b $$1) {
      this.a(
         a,
         () -> {
            List<fud> $$2 = $$0.b();
            ka<cvk> $$3 = $$1.d(lv.K);
            cvk.b $$4 = cvk.b.a($$1);
            cxh $$5 = cxh.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hba<>(
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

   public hbf<fud> b() {
      return this.f.join();
   }

   public void a(List<cvp> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hbb<>($$0xxx -> $$0xxx.j().map(axj::b), $$0), ad.g());
         $$1.cancel(true);
      });
   }

   public hbf<cvp> c() {
      return this.e.join();
   }

   public void a(jp.a $$0, List<cvp> $$1) {
      this.a(
         b,
         () -> {
            cvk.b $$2 = cvk.b.a($$0);
            cxh $$3 = cxh.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hba<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alb::a).stream(), $$1), ad.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hbf<cvp> d() {
      return this.d.join();
   }

   static class a {
   }
}
