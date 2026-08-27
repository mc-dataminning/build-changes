import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gsy implements AutoCloseable {
   private final Map<akt, gsy.a> a;

   public gsy(Map<akt, akt> $$0, gqz $$1) {
      this.a = $$0.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$1x -> {
         gqx $$2 = new gqx((akt)$$1x.getKey());
         $$1.a((akt)$$1x.getKey(), $$2);
         return new gsy.a($$2, (akt)$$1x.getValue());
      }));
   }

   public gqx a(akt $$0) {
      return this.a.get($$0).a();
   }

   @Override
   public void close() {
      this.a.values().forEach(gsy.a::close);
      this.a.clear();
   }

   public Map<akt, CompletableFuture<gsy.b>> a(aud $$0, int $$1, Executor $$2) {
      return this.a.entrySet().stream().collect(Collectors.toMap(Entry::getKey, $$3 -> {
         gsy.a $$4 = $$3.getValue();
         return gqt.a($$4.a).a($$0, $$4.b, $$1, $$2).thenApply($$1xx -> new gsy.b($$4.a, $$1xx));
      }));
   }

   static record a(gqx a, akt b) implements AutoCloseable {

      @Override
      public void close() {
         this.a.f();
      }
   }

   public static class b {
      private final gqx a;
      private final gqt.a b;

      public b(gqx $$0, gqt.a $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Nullable
      public gqy a(akt $$0) {
         return this.b.f().get($$0);
      }

      public gqy a() {
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
