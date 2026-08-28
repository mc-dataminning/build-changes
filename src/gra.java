import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gra implements AutoCloseable {
   private final Map<alf, gra.a> a;

   public gra(Map<alf, alf> $$0, gpb $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         goz $$2 = new goz((alf)$$1x.getKey());
         $$1.a((alf)$$1x.getKey(), $$2);
         return new gra.a($$2, (alf)$$1x.getValue());
      }));
   }

   public goz a(alf $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gra.a::close);
      this.a.clear();
   }

   public Map<alf, CompletableFuture<gra.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gra.a $$4 = $$3.getValue();
         return gov.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gra.b($$4.a, $$1xx));
      }));
   }

   static record a(goz a, alf b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final goz a;
      private final gov.a b;

      public b(goz $$0, gov.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gpa a(alf $$0) {
         return this.b.f().get($$0);
      }

      public gpa a() {
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
