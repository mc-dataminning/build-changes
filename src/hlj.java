import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hlj implements AutoCloseable {
   private final Map<alg, hlj.a> a;

   public hlj(Map<alg, alg> $$0, hjm $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hjj $$2 = new hjj((alg)$$1x.getKey());
         $$1.a((alg)$$1x.getKey(), $$2);
         return new hlj.a($$2, (alg)$$1x.getValue());
      }));
   }

   public hjj a(alg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hlj.a::close);
      this.a.clear();
   }

   public Map<alg, CompletableFuture<hlj.b>> a(avd $$0, int $$1, Executor $$2) {
      return ag.a(
         this.a, (Function<? super hlj.a, CompletableFuture<hlj.b>>)($$3 -> hjf.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hlj.b($$3.a, $$1xx)))
      );
   }

   static record a(hjj a, alg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.g();
      }
   }

   public static class b {
      private final hjj a;
      private final hjf.a b;

      public b(hjj $$0, hjf.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hjk a(alg $$0) {
         return this.b.f().get($$0);
      }

      public hjk a() {
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
