import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gqz implements AutoCloseable {
   private final Map<alf, gqz.a> a;

   public gqz(Map<alf, alf> $$0, gpa $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         goy $$2 = new goy((alf)$$1x.getKey());
         $$1.a((alf)$$1x.getKey(), $$2);
         return new gqz.a($$2, (alf)$$1x.getValue());
      }));
   }

   public goy a(alf $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gqz.a::close);
      this.a.clear();
   }

   public Map<alf, CompletableFuture<gqz.b>> a(aup $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gqz.a $$4 = $$3.getValue();
         return gou.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gqz.b($$4.a, $$1xx));
      }));
   }

   static record a(goy a, alf b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final goy a;
      private final gou.a b;

      public b(goy $$0, gou.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public goz a(alf $$0) {
         return this.b.f().get($$0);
      }

      public goz a() {
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
