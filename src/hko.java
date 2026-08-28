import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hko implements AutoCloseable {
   private final Map<alg, hko.a> a;

   public hko(Map<alg, alg> $$0, hir $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hio $$2 = new hio((alg)$$1x.getKey());
         $$1.a((alg)$$1x.getKey(), $$2);
         return new hko.a($$2, (alg)$$1x.getValue());
      }));
   }

   public hio a(alg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hko.a::close);
      this.a.clear();
   }

   public Map<alg, CompletableFuture<hko.b>> a(avd $$0, int $$1, Executor $$2) {
      return af.a(
         this.a, (Function<? super hko.a, CompletableFuture<hko.b>>)($$3 -> hik.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hko.b($$3.a, $$1xx)))
      );
   }

   static record a(hio a, alg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final hio a;
      private final hik.a b;

      public b(hio $$0, hik.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hip a(alg $$0) {
         return this.b.f().get($$0);
      }

      public hip a() {
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
