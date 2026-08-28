import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class fyu {
   private static final fyu.a a = new fyu.a();
   private static final fyu.a b = new fyu.a();
   private static final fyu.a c = new fyu.a();
   private CompletableFuture<gtg<cua>> d = CompletableFuture.completedFuture(gtg.empty());
   private CompletableFuture<gtg<cua>> e = CompletableFuture.completedFuture(gtg.empty());
   private CompletableFuture<gtg<frc>> f = CompletableFuture.completedFuture(gtg.empty());
   private final Map<fyu.a, Runnable> g = new IdentityHashMap<>();

   private void a(fyu.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cua> $$0, ctv.b $$1, cvt $$2) {
      return $$0.<wu>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ffa $$0, jx.b $$1) {
      this.a(
         a,
         () -> {
            List<frc> $$2 = $$0.b();
            jw<ctv> $$3 = $$1.d(lr.K);
            ctv.b $$4 = ctv.b.a($$1);
            cvt $$5 = cvt.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new gtb<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).g())),
                     $$2
                  ),
               ac.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public gtg<frc> b() {
      return this.f.join();
   }

   public void a(List<cua> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new gtc<>($$0xxx -> $$0xxx.i().map(awk::b), $$0), ac.g());
         $$1.cancel(true);
      });
   }

   public gtg<cua> c() {
      return this.e.join();
   }

   public void a(jl.a $$0, List<cua> $$1) {
      this.a(
         b,
         () -> {
            ctv.b $$2 = ctv.b.a($$0);
            cvt $$3 = cvt.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new gtb<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.h().e().map(akj::a).stream(), $$1), ac.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public gtg<cua> d() {
      return this.d.join();
   }

   static class a {
   }
}
