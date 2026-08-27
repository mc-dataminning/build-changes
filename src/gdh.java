import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gdh implements AutoCloseable {
   private final Map<agg, gdh.a> a;

   public gdh(Map<agg, agg> $$0, gbi $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gbg $$2 = new gbg((agg)$$1x.getKey());
         $$1.a((agg)$$1x.getKey(), $$2);
         return new gdh.a($$2, (agg)$$1x.getValue());
      }));
   }

   public gbg a(agg $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gdh.a::close);
      this.a.clear();
   }

   public Map<agg, CompletableFuture<gdh.b>> a(apd $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gdh.a $$4 = $$3.getValue();
         return gbc.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gdh.b($$4.a, $$1xx));
      }));
   }

   static record a(gbg a, agg b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gbg a;
      private final gbc.a b;

      public b(gbg $$0, gbc.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gbh a(agg $$0) {
         return this.b.f().get($$0);
      }

      public gbh a() {
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
