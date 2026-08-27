import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gdu implements AutoCloseable {
   private final Map<agi, gdu.a> a;

   public gdu(Map<agi, agi> $$0, gbv $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gbt $$2 = new gbt((agi)$$1x.getKey());
         $$1.a((agi)$$1x.getKey(), $$2);
         return new gdu.a($$2, (agi)$$1x.getValue());
      }));
   }

   public gbt a(agi $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gdu.a::close);
      this.a.clear();
   }

   public Map<agi, CompletableFuture<gdu.b>> a(aph $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gdu.a $$4 = $$3.getValue();
         return gbp.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gdu.b($$4.a, $$1xx));
      }));
   }

   static record a(gbt a, agi b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gbt a;
      private final gbp.a b;

      public b(gbt $$0, gbp.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gbu a(agi $$0) {
         return this.b.f().get($$0);
      }

      public gbu a() {
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
