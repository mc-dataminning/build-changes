import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gdy {
   private static final gdy.a a = new gdy.a();
   private static final gdy.a b = new gdy.a();
   private static final gdy.a c = new gdy.a();
   private CompletableFuture<hdl<cwm>> d = CompletableFuture.completedFuture(hdl.empty());
   private CompletableFuture<hdl<cwm>> e = CompletableFuture.completedFuture(hdl.empty());
   private CompletableFuture<hdl<fvx>> f = CompletableFuture.completedFuture(hdl.empty());
   private final Map<gdy.a, Runnable> g = new IdentityHashMap<>();

   private void a(gdy.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwm> $$0, cwi.b $$1, cye $$2) {
      return $$0.<xj>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fjp $$0, ke.b $$1) {
      this.a(
         a,
         () -> {
            List<fvx> $$2 = $$0.b();
            kd<cwi> $$3 = $$1.e(ma.K);
            cwi.b $$4 = cwi.b.a($$1);
            cye $$5 = cye.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hdg<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).h())),
                     $$2
                  ),
               ae.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public hdl<fvx> b() {
      return this.f.join();
   }

   public void a(List<cwm> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hdh<>($$0xxx -> $$0xxx.j().map(axs::b), $$0), ae.g());
         $$1.cancel(true);
      });
   }

   public hdl<cwm> c() {
      return this.e.join();
   }

   public void a(js.a $$0, List<cwm> $$1) {
      this.a(
         b,
         () -> {
            cwi.b $$2 = cwi.b.a($$0);
            cye $$3 = cye.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hdg<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(ali::a).stream(), $$1), ae.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public hdl<cwm> d() {
      return this.d.join();
   }

   static class a {
   }
}
