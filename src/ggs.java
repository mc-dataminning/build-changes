import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ggs {
   private static final ggs.a a = new ggs.a();
   private static final ggs.a b = new ggs.a();
   private static final ggs.a c = new ggs.a();
   private CompletableFuture<hja<cwq>> d = CompletableFuture.completedFuture(hja.empty());
   private CompletableFuture<hja<cwq>> e = CompletableFuture.completedFuture(hja.empty());
   private CompletableFuture<hja<fyn>> f = CompletableFuture.completedFuture(hja.empty());
   private final Map<ggs.a, Runnable> g = new IdentityHashMap<>();

   private void a(ggs.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cwq> $$0, cwm.b $$1, cyi $$2) {
      return $$0.<wp>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(fkv $$0, dgj $$1) {
      this.a(
         a,
         () -> {
            List<fyn> $$2 = $$0.d();
            kf $$3 = $$1.K_();
            ke<cwm> $$4 = $$3.e(mc.K);
            cwm.b $$5 = cwm.b.a($$3);
            bak $$6 = dcr.a($$1);
            cyi $$7 = cyi.a.a;
            CompletableFuture<?> $$8 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new hiv<>(
                     $$3xx -> a($$3xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()), $$5, $$7),
                     $$2xx -> $$2xx.c().stream().flatMap($$1xxxx -> $$1xxxx.a($$6).stream()).map($$1xxxx -> $$4.b($$1xxxx.h())),
                     $$2
                  ),
               af.h()
            );
            $$8.cancel(true);
         }
      );
   }

   public hja<fyn> b() {
      return this.f.join();
   }

   public void a(List<cwq> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new hiw<>($$0xxx -> $$0xxx.j().map(axf::b), $$0), af.h());
         $$1.cancel(true);
      });
   }

   public hja<cwq> c() {
      return this.e.join();
   }

   public void a(jt.a $$0, List<cwq> $$1) {
      this.a(
         b,
         () -> {
            cwm.b $$2 = cwm.b.a($$0);
            cyi $$3 = cyi.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new hiv<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.i().e().map(aku::a).stream(), $$1), af.h()
            );
            $$4.cancel(true);
         }
      );
   }

   public hja<cwq> d() {
      return this.d.join();
   }

   static class a {
   }
}
