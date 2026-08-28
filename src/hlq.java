import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hlq implements AutoCloseable {
   private final Map<alg, hlq.a> a;

   public hlq(Map<alg, alg> $$0, hjs $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hjp $$2 = new hjp((alg)$$1x.getKey());
         $$1.a((alg)$$1x.getKey(), $$2);
         return new hlq.a($$2, (alg)$$1x.getValue());
      }));
   }

   public hjp a(alg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hlq.a::close);
      this.a.clear();
   }

   public Map<alg, CompletableFuture<hlq.b>> a(avd $$0, int $$1, Executor $$2) {
      return ag.a(
         this.a, (Function<? super hlq.a, CompletableFuture<hlq.b>>)($$3 -> hjl.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hlq.b($$3.a, $$1xx)))
      );
   }

   static record a(hjp a, alg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.e();
      }
   }

   public static class b {
      private final hjp a;
      private final hjl.a b;

      public b(hjp $$0, hjl.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hjq a(alg $$0) {
         return this.b.f().get($$0);
      }

      public hjq a() {
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
