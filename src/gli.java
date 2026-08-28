import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gli {
   private static final gli.a a = new gli.a();
   private static final gli.a b = new gli.a();
   private static final gli.a c = new gli.a();
   private CompletableFuture<hny<czn>> d = CompletableFuture.completedFuture(hny.empty());
   private CompletableFuture<hny<czn>> e = CompletableFuture.completedFuture(hny.empty());
   private CompletableFuture<hny<gcv>> f = CompletableFuture.completedFuture(hny.empty());
   private final Map<gli.a, Runnable> g = new IdentityHashMap<>();

   private void a(gli.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<czn> $$0, czj.b $$1, dbc $$2) {
      return $$0.<wy>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> o.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fpe $$0, djm $$1) {
      this.a(
         a,
         () -> {
            List<gcv> $$2 = $$0.d();
            jt $$3 = $$1.F_();
            js<czj> $$4 = $$3.f(mh.K);
            czj.b $$5 = czj.b.a($$3);
            baz $$6 = dfr.a($$1);
            dbc $$7 = dbc.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hnt<>(
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

   public hny<gcv> b() {
      return this.f.join();
   }

   public void a(List<czn> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hnu<>($$0xxx -> $$0xxx.j().map(axr::b), $$0), ag.h());
         $$1.cancel(true);
      });
   }

   public hny<czn> c() {
      return this.e.join();
   }

   public void a(jh.a $$0, List<czn> $$1) {
      this.a(
         b,
         () -> {
            czj.b $$2 = czj.b.a($$0);
            dbc $$3 = dbc.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hnt<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alf::a).stream(), $$1), ag.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hny<czn> d() {
      return this.d.join();
   }

   static class a {
   }
}
