import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gnr implements AutoCloseable {
   private final Map<ajv, gnr.a> a;

   public gnr(Map<ajv, ajv> $$0, glt $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         glr $$2 = new glr((ajv)$$1x.getKey());
         $$1.a((ajv)$$1x.getKey(), $$2);
         return new gnr.a($$2, (ajv)$$1x.getValue());
      }));
   }

   public glr a(ajv $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gnr.a::close);
      this.a.clear();
   }

   public Map<ajv, CompletableFuture<gnr.b>> a(ate $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gnr.a $$4 = $$3.getValue();
         return gln.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gnr.b($$4.a, $$1xx));
      }));
   }

   static record a(glr a, ajv b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final glr a;
      private final gln.a b;

      public b(glr $$0, gln.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gls a(ajv $$0) {
         return this.b.f().get($$0);
      }

      public gls a() {
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
