import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class fzu {
   private static final fzu.a a = new fzu.a();
   private static final fzu.a b = new fzu.a();
   private static final fzu.a c = new fzu.a();
   private CompletableFuture<gui<cuq>> d = CompletableFuture.completedFuture(gui.empty());
   private CompletableFuture<gui<cuq>> e = CompletableFuture.completedFuture(gui.empty());
   private CompletableFuture<gui<fsc>> f = CompletableFuture.completedFuture(gui.empty());
   private final Map<fzu.a, Runnable> g = new IdentityHashMap<>();

   private void a(fzu.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cuq> $$0, cul.b $$1, cwm $$2) {
      return $$0.<wz>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ffy $$0, ka.b $$1) {
      this.a(
         a,
         () -> {
            List<fsc> $$2 = $$0.b();
            jz<cul> $$3 = $$1.d(lu.K);
            cul.b $$4 = cul.b.a($$1);
            cwm $$5 = cwm.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new gud<>(
                     $$3xx -> a($$3xx.e().stream().map($$1xxxx -> $$1xxxx.b().a($$1)), $$4, $$5),
                     $$2xx -> $$2xx.e().stream().map($$2xxx -> $$3.b($$2xxx.b().a($$1).g())),
                     $$2
                  ),
               ad.g()
            );
            $$6.cancel(true);
         }
      );
   }

   public gui<fsc> b() {
      return this.f.join();
   }

   public void a(List<cuq> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new gue<>($$0xxx -> $$0xxx.i().map(awu::b), $$0), ad.g());
         $$1.cancel(true);
      });
   }

   public gui<cuq> c() {
      return this.e.join();
   }

   public void a(jo.a $$0, List<cuq> $$1) {
      this.a(
         b,
         () -> {
            cul.b $$2 = cul.b.a($$0);
            cwm $$3 = cwm.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new gud<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.h().e().map(akq::a).stream(), $$1), ad.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public gui<cuq> d() {
      return this.d.join();
   }

   static class a {
   }
}
