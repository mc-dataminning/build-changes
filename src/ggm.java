import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class ggm implements AutoCloseable {
   private final Map<ahg, ggm.a> a;

   public ggm(Map<ahg, ahg> $$0, geo $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gem $$2 = new gem((ahg)$$1x.getKey());
         $$1.a((ahg)$$1x.getKey(), $$2);
         return new ggm.a($$2, (ahg)$$1x.getValue());
      }));
   }

   public gem a(ahg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(ggm.a::close);
      this.a.clear();
   }

   public Map<ahg, CompletableFuture<ggm.b>> a(aqi $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         ggm.a $$4 = $$3.getValue();
         return gei.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new ggm.b($$4.a, $$1xx));
      }));
   }

   static record a(gem a, ahg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gem a;
      private final gei.a b;

      public b(gem $$0, gei.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gen a(ahg $$0) {
         return this.b.f().get($$0);
      }

      public gen a() {
         return this.b.e();
      }

      public CompletableFuture<Void> b() {
         return this.b.g();
      }

      public void c() {
         this.a.a(this.b);
      }
   }
}
