import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hjy implements AutoCloseable {
   private final Map<ale, hjy.a> a;

   public hjy(Map<ale, ale> $$0, hib $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         hhy $$2 = new hhy((ale)$$1x.getKey());
         $$1.a((ale)$$1x.getKey(), $$2);
         return new hjy.a($$2, (ale)$$1x.getValue());
      }));
   }

   public hhy a(ale $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hjy.a::close);
      this.a.clear();
   }

   public Map<ale, CompletableFuture<hjy.b>> a(avb $$0, int $$1, Executor $$2) {
      return af.a(
         this.a, (Function<? super hjy.a, CompletableFuture<hjy.b>>)($$3 -> hhu.a($$3.a).a($$0, $$3.b, $$1, $$2).thenApply($$1xx -> new hjy.b($$3.a, $$1xx)))
      );
   }

   static record a(hhy a, ale b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final hhy a;
      private final hhu.a b;

      public b(hhy $$0, hhu.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public hhz a(ale $$0) {
         return this.b.f().get($$0);
      }

      public hhz a() {
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
