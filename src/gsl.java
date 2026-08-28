import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsl implements AutoCloseable {
   private final Map<akr, gsl.a> a;

   public gsl(Map<akr, akr> $$0, gqm $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gqk $$2 = new gqk((akr)$$1x.getKey());
         $$1.a((akr)$$1x.getKey(), $$2);
         return new gsl.a($$2, (akr)$$1x.getValue());
      }));
   }

   public gqk a(akr $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gsl.a::close);
      this.a.clear();
   }

   public Map<akr, CompletableFuture<gsl.b>> a(aue $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gsl.a $$4 = $$3.getValue();
         return gqg.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gsl.b($$4.a, $$1xx));
      }));
   }

   static record a(gqk a, akr b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gqk a;
      private final gqg.a b;

      public b(gqk $$0, gqg.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gql a(akr $$0) {
         return this.b.f().get($$0);
      }

      public gql a() {
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
