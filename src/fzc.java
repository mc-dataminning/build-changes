import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class fzc {
   private static final fzc.a a = new fzc.a();
   private static final fzc.a b = new fzc.a();
   private static final fzc.a c = new fzc.a();
   private CompletableFuture<gto<cud>> d = CompletableFuture.completedFuture(gto.empty());
   private CompletableFuture<gto<cud>> e = CompletableFuture.completedFuture(gto.empty());
   private CompletableFuture<gto<frk>> f = CompletableFuture.completedFuture(gto.empty());
   private final Map<fzc.a, Runnable> g = new IdentityHashMap<>();

   private void a(fzc.a $$0, Runnable $$1) {
      $$1.run();
      this.g.put($$0, $$1);
   }

   public void a() {
      for (Runnable $$0 : this.g.values()) {
         $$0.run();
      }
   }

   private static Stream<String> a(Stream<cud> $$0, cty.b $$1, cvw $$2) {
      return $$0.<wu>flatMap($$2x -> $$2x.a($$1, null, $$2).stream()).map($$0x -> n.a($$0x.getString()).trim()).filter($$0x -> !$$0x.isEmpty());
   }

   public void a(ffi $$0, jx.b $$1) {
      this.a(
         a,
         () -> {
            List<frk> $$2 = $$0.b();
            jw<cty> $$3 = $$1.d(lr.K);
            cty.b $$4 = cty.b.a($$1);
            cvw $$5 = cvw.a.a;
            CompletableFuture<?> $$6 = this.f;
            this.f = CompletableFuture.supplyAsync(
               () -> new gtj<>(
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

   public gto<frk> b() {
      return this.f.join();
   }

   public void a(List<cud> $$0) {
      this.a(c, () -> {
         CompletableFuture<?> $$1 = this.e;
         this.e = CompletableFuture.supplyAsync(() -> new gtk<>($$0xxx -> $$0xxx.i().map(awm::b), $$0), ac.g());
         $$1.cancel(true);
      });
   }

   public gto<cud> c() {
      return this.e.join();
   }

   public void a(jl.a $$0, List<cud> $$1) {
      this.a(
         b,
         () -> {
            cty.b $$2 = cty.b.a($$0);
            cvw $$3 = cvw.a.a.c();
            CompletableFuture<?> $$4 = this.d;
            this.d = CompletableFuture.supplyAsync(
               () -> new gtj<>($$2xx -> a(Stream.of($$2xx), $$2, $$3), $$0xxx -> $$0xxx.h().e().map(akj::a).stream(), $$1), ac.g()
            );
            $$4.cancel(true);
         }
      );
   }

   public gto<cud> d() {
      return this.d.join();
   }

   static class a {
   }
}
