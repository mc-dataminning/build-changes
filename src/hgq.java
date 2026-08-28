import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class hgq implements AutoCloseable {
   private final Map<akv, hgq.a> a;

   public hgq(Map<akv, akv> $$0, het $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         heq $$2 = new heq((akv)$$1x.getKey());
         $$1.a((akv)$$1x.getKey(), $$2);
         return new hgq.a($$2, (akv)$$1x.getValue());
      }));
   }

   public heq a(akv $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(hgq.a::close);
      this.a.clear();
   }

   public Map<akv, CompletableFuture<hgq.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         hgq.a $$4 = $$3.getValue();
         return hem.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new hgq.b($$4.a, $$1xx));
      }));
   }

   static record a(heq a, akv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final heq a;
      private final hem.a b;

      public b(heq $$0, hem.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public her a(akv $$0) {
         return this.b.f().get($$0);
      }

      public her a() {
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
