import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class gld {
   private static final gld.a a = new gld.a();
   private static final gld.a b = new gld.a();
   private static final gld.a c = new gld.a();
   private CompletableFuture<hnr<czk>> d = CompletableFuture.completedFuture(hnr.empty());
   private CompletableFuture<hnr<czk>> e = CompletableFuture.completedFuture(hnr.empty());
   private CompletableFuture<hnr<gcq>> f = CompletableFuture.completedFuture(hnr.empty());
   private final Map<gld.a, Runnable> g = new IdentityHashMap<>();

   private void a(gld.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<czk> $$0, czg.b $$1, daz $$2) {
      return $$0.<wy>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> o.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(foz $$0, djh $$1) {
      this.a(
         a,
         () -> {
            List<gcq> $$2 = $$0.d();
            jt $$3 = $$1.F_();
            js<czg> $$4 = $$3.f(mh.K);
            czg.b $$5 = czg.b.a($$3);
            baz $$6 = dfo.a($$1);
            daz $$7 = daz.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hnm<>(
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

   public hnr<gcq> b() {
      return this.f.join();
   }

   public void a(List<czk> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hnn<>($$0xxx -> $$0xxx.j().map(axr::b), $$0), ag.h());
         $$1.cancel(true);
      });
   }

   public hnr<czk> c() {
      return this.e.join();
   }

   public void a(jh.a $$0, List<czk> $$1) {
      this.a(
         b,
         () -> {
            czg.b $$2 = czg.b.a($$0);
            daz $$3 = daz.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hnm<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(alf::a).stream(), $$1), ag.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hnr<czk> d() {
      return this.d.join();
   }

   static class a {
   }
}
